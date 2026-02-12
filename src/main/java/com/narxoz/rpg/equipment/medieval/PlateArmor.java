package com.narxoz.rpg.equipment.medieval;

import com.narxoz.rpg.equipment.Armor;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;
    private double physicalRes;
    private double magicalRes;

    public PlateArmor() {
        this.defense = 25;
        this.armorType = "Plate Armor";
        this.physicalRes = 30;
        this.magicalRes = 0;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Popular protective armor forged by a local blacksmith";
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

    // Medieval set provides x1.2 multiplier to strength and health
}
