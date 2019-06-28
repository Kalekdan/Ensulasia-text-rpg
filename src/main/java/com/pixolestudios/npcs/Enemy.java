package main.java.com.pixolestudios.npcs;

import main.java.com.pixolestudios.enums.AttackType;

public abstract class Enemy extends NPC {
    protected Enemy(String name, float maxHP, AttackType weakness){
        super(name, maxHP, true);
        setWeakness(weakness);
    }

    @Override
    public void encounter() {
        startCombat();
    }
}
