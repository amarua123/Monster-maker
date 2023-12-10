package org.example;

import java.lang.reflect.Field;
import java.util.*;

public class GenerateBabyMonsters {
    public static List<Monster> getBabies(List<Monster> monsters, Monster newMonster){
        List<Monster> babies = new ArrayList<>();
        Random r = new Random();
        for(Monster m: monsters){
            Monster baby = new Monster();
            Field[] fields = Monster.class.getDeclaredFields();
            for(Field f: fields){
                f.setAccessible(true);
                int randomIndex = r.nextInt(2);
                try {
                    if(randomIndex == 0)
                        f.set(baby, f.get(newMonster));
                    else
                        f.set(baby, f.get(m));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            babies.add(baby);
        }
        return babies;
    }
}
