package com.narxoz.rpg.equipment.field_ranger;

import com.narxoz.rpg.equipment.Armor;

public class ReliableCloak implements Armor {

    private int defense;
    private String armorType;
    private double physicalRes;
    private double magicalRes;

    public ReliableCloak() {
        this.defense = 15;
        this.armorType = "Reliable Cloak";
        this.physicalRes = 10;
        this.magicalRes = 5;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Reliable Cloak (Field Ranger) - Light, but effective coat. Protects from minor injuries";
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

    // Field Ranger set provides 20% chance to land critical hit
}
