package com.narxoz.rpg.equipment.field_ranger;

import com.narxoz.rpg.equipment.Weapon;

public class LongBow implements Weapon {

    private int damage;
    private String weaponType;

    public LongBow() {
        this.damage = 20;
        this.weaponType = "Longbow";
    }


    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Longbow (Field Ranger) - Iron staff with an enchanted Opal at its end";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }

    //Field Ranger set provides 20% chance to land critical hit
}
