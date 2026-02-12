package com.narxoz.rpg.factory.characters;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {
    public abstract Character createCharacter(String name);
}
