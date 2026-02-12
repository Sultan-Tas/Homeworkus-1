package com.narxoz.rpg.factory.equipments;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.field_ranger.LongBow;
import com.narxoz.rpg.equipment.field_ranger.ReliableCloak;
import com.narxoz.rpg.equipment.medieval.IronSword;
import com.narxoz.rpg.equipment.medieval.PlateArmor;

public class RangerEquipmentFactory extends EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new LongBow();
    }

    @Override
    public Armor createArmor() {
        return new ReliableCloak();
    }
}
