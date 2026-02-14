package com.narxoz.rpg.character;

public class Archer extends Character {

    public Archer(String name) {
        super(name, 110, 90, 50, 60);
        // Archer stats: average HP and STR, less than average mana and INT
        className = "Archer";
        ability = "Leaf Village Technique";
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses [Leaf Village Technique] -> Next incoming attack will be dodged!");
    }
}
