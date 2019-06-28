package main.java.com.pixolestudios.ensrpg;

import main.java.com.pixolestudios.enums.AttackType;
import main.java.com.pixolestudios.items.Sword;
import main.java.com.pixolestudios.npcs.NPC;

public class Player {
    private String name;


    public Player(){

    }

    public void attack(NPC other){
        other.attacked(10, new Sword("Sword of Ice and Fire", AttackType.ICE, AttackType.FIRE));
    }
}
