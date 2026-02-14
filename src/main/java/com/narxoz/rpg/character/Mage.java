package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage extends Character {

    // TODO: Add fields for equipped weapon and armor

    public Mage(String name) {
        super(name, 90, 200, 25, 80);
        //Mage stats: low HP and STR, high Mana and INT
        className = "Mage";
        ability = "Moment of Clarity";
    }

    // TODO: Implement methods from Character interface
    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses [MOMENT OF CLARITY] -> INT Greatly increased for next move!");
    }



    // TODO: Add equipment-related methods
    //everything in the Abstract Class
}
