package com.narxoz.rpg.factory.equipments;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.medieval.IronSword;
import com.narxoz.rpg.equipment.medieval.PlateArmor;

public class MedievalEquipmentFactory extends EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }
}
