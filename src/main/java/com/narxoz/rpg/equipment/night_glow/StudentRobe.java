package com.narxoz.rpg.equipment.night_glow;

import com.narxoz.rpg.equipment.Armor;

public class StudentRobe implements Armor {

    private int defense;
    private String armorType;
    private double physicalRes;
    private double magicalRes;

    public StudentRobe() {
        this.defense = 5;
        this.armorType = "Student's Robe";
        this.physicalRes = 0;
        this.magicalRes = 20;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Student's Robe (Night-glow) - Common lavish blue wear among beginner wizards";
    }

    @Override
    public double getPhysicalRes() {
        return physicalRes;
    }

    @Override
    public double getMagicRes() {
        return magicalRes;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Phys. Res.: " + physicalRes);
        System.out.println("Magic Res.: " + magicalRes);
    }

    // Night-glow set provides +40 to mana
}
