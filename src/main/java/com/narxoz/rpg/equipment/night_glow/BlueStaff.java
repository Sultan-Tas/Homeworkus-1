package com.narxoz.rpg.equipment.night_glow;

import com.narxoz.rpg.equipment.Weapon;

public class BlueStaff implements Weapon {

    private int damage;
    private String weaponType;

    public BlueStaff() {
        this.damage = 40;
        this.weaponType = "Blue staff";
    }


    public int getDamage() {
        return damage;
    }

    public String getWeaponInfo() {
        return "Blue Staff (Night-glow) - Iron staff with an enchanted Opal at its end";
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

    //Night-glow set provides +40 to mana
}
