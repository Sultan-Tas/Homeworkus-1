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
public interface Character {

    // TODO: Define common character behaviors
    String getName();
    String getCharacterClass();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    String getSpecialAbility();
    void displayStats();
    void useSpecialAbility();

    // TODO: Think about equipment
    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void checkEquipment();

    void unequipWeapon();
    void unequipArmor();
}
