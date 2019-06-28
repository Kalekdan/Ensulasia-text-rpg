package main.java.com.pixolestudios.ensrpg;

public abstract class NPC {
    private String name;
    private String weakness;
    private float maxHP;
    private float currentHP;
    private boolean isAggressive;

    protected NPC(String name, float maxHP, boolean isAggressive){
        this.name = name;
        this.maxHP = maxHP;
        currentHP = maxHP;
        this.isAggressive = isAggressive;
    }

    public String getName(){
        return name;
    }
}
