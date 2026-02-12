package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main demonstration class for the RPG Character & Equipment System.
 *
 * Your task: Demonstrate both Factory Method and Abstract Factory patterns working together.
 *
 * This file should showcase:
 * 1. Creating different character types using Factory Method pattern
 * 2. Equipping characters with themed equipment using Abstract Factory pattern
 * 3. Displaying character stats and equipment details
 *
 * Expected output flow:
 * - Create 3+ different characters
 * - Equip each with different themed equipment sets
 * - Show that the system is extensible and maintainable
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, CharacterFactory> registry = new HashMap<>();
        registry.put("warrior", new WarriorFactory());
        registry.put("mage", new MageFactory());

        System.out.println("=== RPG Character & Equipment System ===\n");

        // TODO: Demonstrate Factory Method Pattern
        System.out.println("Input character type:\n [Warrior], [Mage], [Archer]");
        String classChoice = scan.nextLine();
        System.out.println("Name of your Hero: ");
        String name = scan.nextLine();
        CharacterFactory factory = registry.get(classChoice.toLowerCase());
        Character hero = factory.createCharacter(name);

        hero.displayStats();


        // TODO: Demonstrate Abstract Factory Pattern
        // Create equipment sets (Medieval, Magic, Ranger, etc.)
        // Think: How do you ensure weapons and armor from same theme are created together?
        // Think: What guarantees a Medieval sword comes with Medieval armor?


        // TODO: Show character stats
        // Display each character's attributes (health, mana, strength, intelligence)
        // Show their special abilities
        hero.displayStats();
        hero.useSpecialAbility();


        // TODO: Equip characters with different themed sets
        // Warrior with Medieval equipment
        // Mage with Magic equipment
        // Archer with Ranger equipment
        // etc.


        // TODO: Display equipped items
        // Show weapon details (damage, special properties)
        // Show armor details (defense, special properties)


        // TODO: (Optional) Demonstrate extensibility
        // In comments, explain how easy it would be to:
        // - Add a new character class (e.g., Rogue, Paladin)
        // - Add a new equipment theme (e.g., Dragon Slayer, Undead)


        System.out.println("\n=== Demo Complete ===");
    }

    // TODO: Add helper methods as needed
    // Consider methods like:
    // - createAndDisplayCharacter(...)
    // - equipCharacter(...)
    // - displayCharacterInfo(...)
}
