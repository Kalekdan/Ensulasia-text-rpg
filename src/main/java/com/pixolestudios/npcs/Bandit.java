package main.java.com.pixolestudios.npcs;

import main.java.com.pixolestudios.enums.AttackType;

public class Bandit extends Enemy{
    public Bandit(String name, float maxHP) {
        super(name, maxHP, AttackType.FIRE);
    }
}
