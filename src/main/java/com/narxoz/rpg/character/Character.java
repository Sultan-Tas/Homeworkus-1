package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

/**
 * Base interface for all character types in the RPG system.
 *
 * TODO: Decide if this should be an interface or abstract class
 * Think: What's common to ALL characters?
 * Think: What varies between character types?
 *
 * Factory Method Pattern:
 * This represents the "Product" in the Factory Method pattern.
 * Different character classes (Warrior, Mage, Archer) are concrete products.
 */
public abstract class Character {

    protected String name;
    protected String className;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected String ability;
    protected Weapon weapon = null;
    protected Armor armor = null;

    public Character(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    // TODO: Define common character behaviors
    public String getName(){
        return name;
    };
    public String getCharacterClass(){
        return className;
    }
    public int getHealth(){
        return health;
    };
    public int getMana(){
        return mana;
    };
    public int getStrength(){
        return strength;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public String getSpecialAbility(){
        return ability;
    }
    public void displayStats(){
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    };
    abstract void useSpecialAbility();

    // TODO: Think about equipment
    public void equipWeapon(Weapon weapon){this.weapon = weapon;}
    public void equipArmor(Armor armor){this.armor = armor;}
    public void checkEquipment(){
        System.out.println("\tCurrent Equipment\n" +
                "\tWeapon:[" + ((weapon == null)?"Empty" :weapon.getWeaponType())+" - Damage: "+weapon.getDamage()+"]\n" +
                "\tArmor:[" + ((armor == null)?"Empty":armor.getArmorType())+" - Defense: "+armor.getDefense()+"]\n");
    }

    public void unequipWeapon(){
        this.weapon = null;
    }
    public void unequipArmor(){
        this.armor = null;
    }
}
