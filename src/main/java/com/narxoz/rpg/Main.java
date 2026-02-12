package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.characters.ArcherFactory;
import com.narxoz.rpg.factory.characters.CharacterFactory;
import com.narxoz.rpg.factory.characters.MageFactory;
import com.narxoz.rpg.factory.characters.WarriorFactory;
import com.narxoz.rpg.factory.equipments.*;

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
        registry.put("archer", new ArcherFactory());

        Map<String, EquipmentFactory> equipmentTypes = new HashMap<>();
        equipmentTypes.put("medieval", new MedievalEquipmentFactory());
        equipmentTypes.put("nightglow", new NightglowEquipmentFactory());
        equipmentTypes.put("ranger", new RangerEquipmentFactory());

        System.out.println("=== RPG Character & Equipment System ===\n");

        // TODO: Demonstrate Factory Method Pattern
        System.out.println("Creating sample  Warrior...");
        CharacterFactory factory = registry.get("warrior");
        Character warrior = factory.createCharacter("Conan Barbar");

        System.out.println("\nCreating sample  Mage...");
        factory = registry.get("mage");
        Character mage = factory.createCharacter("Gandalf");

        System.out.println("\nCreating sample  Archer...");
        factory = registry.get("archer");
        Character archer = factory.createCharacter("Conan Barbar");




        // TODO: Demonstrate Abstract Factory Pattern
        // Create equipment sets (Medieval, Magic, Ranger, etc.)
        // Think: How do you ensure weapons and armor from same theme are created together?
        // Think: What guarantees a Medieval sword comes with Medieval armor?
        System.out.println("Creating and equipping weapons...");
        EquipmentFactory adminForge = equipmentTypes.get("medieval");
        Weapon sword = adminForge.createWeapon();
        Armor armor = adminForge.createArmor();

        adminForge = equipmentTypes.get("nightglow");
        Weapon staff = adminForge.createWeapon();
        Armor robe = adminForge.createArmor();

        adminForge = equipmentTypes.get("ranger");
        Weapon bow = adminForge.createWeapon();
        Armor cloak = adminForge.createArmor();



        // TODO: Equip characters with different themed sets
        warrior.equipArmor(armor);
        warrior.equipWeapon(sword);

        mage.equipArmor(robe);
        mage.equipWeapon(staff);

        archer.equipArmor(cloak);
        archer.equipWeapon(bow);


        // Display equipped items

        // Show character stats

        displayCharacterInfo(warrior);
        warrior.checkEquipment();
        displayCharacterInfo(mage);
        mage.checkEquipment();
        displayCharacterInfo(archer);
        archer.checkEquipment();

        //choice of character
        System.out.println("\nInput character type:\n [Warrior], [Mage], [Archer]");
        String classChoice = scan.nextLine();
        System.out.println("Name of your Hero: ");
        String name = scan.nextLine();
        factory = registry.get(classChoice.toLowerCase());
        Character hero = factory.createCharacter(name);
        System.out.println("Type which set to equip:\n [Medieval], [Nightglow], [Ranger]");
        String equipChoice = scan.nextLine();

        adminForge = equipmentTypes.get(equipChoice.toLowerCase());
        Weapon heroWeapon = adminForge.createWeapon();
        Armor heroArmor = adminForge.createArmor();

        hero.equipWeapon(heroWeapon);
        hero.equipArmor(heroArmor);

        displayCharacterInfo(hero);
        hero.checkEquipment();


        // In comments, explain how easy it would be to:
        // - Add a new character class (e.g., Rogue, Paladin)

        //Creation of a new character is easy since you only need to copy-paste existing character
        //and adjust stats. You also need to create Factory, but they have a lot in common, so
        //implementation of a new character is a lot easier

        // - Add a new equipment theme (e.g., Dragon Slayer, Undead)

        //Same with equipment. Create new classes, set stats and methods, then create factory for the theme
        //much simpler than creating constructors for each part of equipment


        System.out.println("\n=== Demo Complete ===");
    }

    public static void displayCharacterInfo(Character hero){
        System.out.println("==== " + hero.getName() + " (" + hero.getCharacterClass() + ") ====\n" +
                "HP: " + hero.getHealth() + "\n" +
                "STR: " + hero.getStrength() + "\n" +
                "INT: " + hero.getIntelligence() + "\n" +
                "MANA: " + hero.getMana() + "\n" +
                "Special Ability: " + hero.getSpecialAbility() + "\n");
    }
}
