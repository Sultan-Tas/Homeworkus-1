package com.narxoz.rpg.factory.characters;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Archer;

public class ArcherFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }

}
