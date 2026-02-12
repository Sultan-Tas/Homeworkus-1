package com.narxoz.rpg.factory.equipments;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.medieval.IronSword;
import com.narxoz.rpg.equipment.medieval.PlateArmor;
import com.narxoz.rpg.equipment.night_glow.BlueStaff;
import com.narxoz.rpg.equipment.night_glow.StudentRobe;

public class NightglowEquipmentFactory extends EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new BlueStaff();
    }

    @Override
    public Armor createArmor() {
        return new StudentRobe();
    }
}
