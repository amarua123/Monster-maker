package org.example;
public class Monster {
    String eyeColor, featherColor, weakness, ability;
    int size, strength, durability, aggressionLevel;
    Monster(){

    }
    Monster(String eyeColor, String featherColor, String weakness, String ability, int size, int strength, int durability, int aggressionLevel){
        this.eyeColor = eyeColor.toLowerCase();
        this.featherColor = featherColor.toUpperCase();
        this.weakness = weakness.toUpperCase();
        this.ability = ability.toUpperCase();
        this.size = size;
        this.strength = strength;
        this.durability = durability;
        this.aggressionLevel = aggressionLevel;
    }
    @Override
    public String toString() {
        return "{ EyeColor: " + eyeColor +
                ", FeatherColor: " + featherColor +
                ", Weakness: " + weakness +
                ", Ability: " + ability +
                ", Size: " + size +
                ", Strength: " + strength +
                ", Durability: " + durability +
                ", AggressionLevel: " + aggressionLevel +" }";
    }

    @Override
    public int hashCode() {
        return (eyeColor + "$" +
                featherColor + "$" +
                weakness + "$" +
                ability + "$" +
                size + "$" +
                strength + "$" +
                durability + "$" +
                aggressionLevel).hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
