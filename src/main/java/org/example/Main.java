package org.example;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
//        Monster m1 = new Monster("RED", "BLACK","SUN LIGHT", "FLY", 100, 200, 500, 100);
//        Monster m2 = new Monster("BLUE", "PINK", "WATER", "CHANGE SIZE", 200, 100, 300, 100);

        List<Monster> monsters = new ArrayList<>();
        List<Monster> ch = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Monster you want to enter: ");
        int no = in.nextInt();
        for(int i = 0; i < no; i++){
            System.out.println("Enter the Properties of the Monster");
            System.out.println("Enter the Eye Color: ");
            String eyeColor = in.next();
            System.out.println("Enter the Feather Color: ");
            String featherColor = in.next();
            System.out.println("Enter the Weakness: ");
            String weakness = in.next();
            System.out.println("Enter the Special Ability: ");
            String ability = in.next();
            System.out.println("Enter the Size of the Monster: ");
            int size = in.nextInt();
            System.out.println("Enter the Strength: ");
            int strength = in.nextInt();
            System.out.println("Enter the durability: ");
            int durability = in.nextInt();
            System.out.println("Enter the Aggression Level: ");
            int aggressionLevel = in.nextInt();
            Monster m = new Monster(eyeColor, featherColor, weakness, ability, size, strength, durability, aggressionLevel);

            if(monsters.size() > 0){
                for(Monster baby: GenerateBabyMonsters.getBabies(monsters, m)){
                    ch.add(baby);
                }
            }
            monsters.add(m);
        }
        System.out.println("Monsters are: ");
        for(Monster m: monsters){
            System.out.println(m);
        }
        System.out.println("Baby Monsters are: ");
        for(Monster m: ch){
            System.out.println(m);
        }
    }
}