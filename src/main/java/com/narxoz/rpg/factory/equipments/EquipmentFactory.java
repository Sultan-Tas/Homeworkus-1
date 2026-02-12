package com.narxoz.rpg.factory.equipments;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public abstract class EquipmentFactory {
    public abstract Weapon createWeapon();
    public abstract Armor createArmor();
}
