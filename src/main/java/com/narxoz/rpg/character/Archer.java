package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private String className = "Archer";
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private String ability = "LEAF VILLAGE TECHNIQUE";
    private Weapon weapon = null;
    private Armor armor = null;

    public Archer(String name) {
        this.name = name;
        // Archer stats: average HP and STR, less than average mana and INT
        this.health = 110;
        this.mana = 90;
        this.strength = 50;
        this.intelligence = 60;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCharacterClass() {
        return className;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public String getSpecialAbility() {
        return ability;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses [Leaf Village Technique] -> Next incoming attack will be dodged!");
    }


    @Override
    public void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor){
        this.armor = armor;
    }

    @Override
    public void checkEquipment(){
        System.out.println("\tCurrent Equipment\n" +
                "\tWeapon:[" + ((weapon == null)?"Empty" :weapon.getWeaponType())+" - Damage: "+weapon.getDamage()+"]\n" +
                "\tArmor:[" + ((armor == null)?"Empty":armor.getArmorType())+" - Defense: "+armor.getDefense()+"]\n");
    }

    @Override
    public void unequipWeapon() {
        this.weapon = null;
    }

    @Override
    public void unequipArmor() {
        this.armor = null;
    }
}
