package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

import java.sql.SQLOutput;

/**
 * Example concrete implementation of a Character.
 *
 * This is provided as a reference to help you get started.
 * Study this implementation, then create similar classes for Mage, Archer, etc.
 *
 * Notice:
 * - How attributes are initialized
 * - How methods are implemented
 * - The structure you should follow for other character types
 *
 * TODO: Create similar implementations for:
 * - Mage (high mana/intelligence, low health/strength)
 * - Archer (balanced stats, ranged combat)
 * - (Optional) Additional classes: Rogue, Paladin, etc.
 */
public class Warrior extends Character {

    // TODO: Add fields for equipped weapon and armor


    public Warrior(String name) {
        super(name, 150, 30, 80, 20);
        // Warrior stats: high HP and STR, low mana and INT
        className = "Warrior";
        ability = "Berserker Rage";
    }

    // TODO: Implement methods from Character interface

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCharacterClass() {
        return className;
    }


    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public String getSpecialAbility() {
        return ability;
    }

    public void useSpecialAbility() {
        System.out.println(name + " uses [BERSERKER RAGE] -> Strength temporarily increased!");
    }



    // TODO: Add equipment-related methods
    @Override
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    @Override
    public void checkEquipment(){
        System.out.println("\tCurrent Equipment\n" +
                "\tWeapon:[" + ((weapon == null)?"Empty" :weapon.getWeaponType())+" - Damage: "+weapon.getDamage()+"]\n" +
                "\tArmor:[" + ((armor == null)?"Empty":armor.getArmorType())+" - Defense: "+armor.getDefense()+"]\n");
    }

    @Override
    public void unequipWeapon() {
        this.weapon = null;
    }

    @Override
    public void unequipArmor() {
        this.armor = null;
    }
}
