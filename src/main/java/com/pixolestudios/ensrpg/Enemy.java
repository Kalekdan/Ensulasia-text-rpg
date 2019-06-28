package main.java.com.pixolestudios.ensrpg;

public abstract class Enemy extends NPC {
    protected Enemy(String name, float maxHP){
        super(name, maxHP, true);
    }
}
