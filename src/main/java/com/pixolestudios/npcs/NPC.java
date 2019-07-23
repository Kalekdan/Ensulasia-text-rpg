package main.java.com.pixolestudios.npcs;

import main.java.com.pixolestudios.enums.AttackType;
import main.java.com.pixolestudios.items.Weapon;

public abstract class NPC {
    private String name;
    private AttackType weakness;
    // Damage multiplier if using attack of type matchin weakness
    private float weaknessAmount;
    private float maxHP;
    private float currentHP;
    private boolean isAggressive;

    protected NPC(String name, float maxHP, boolean isAggressive){
        this.name = name;
        this.maxHP = maxHP;
        currentHP = maxHP;
        this.isAggressive = isAggressive;
        weakness = AttackType.NONE;
        weaknessAmount = 2;
    }

    public void setWeakness(AttackType weakness) {
        this.weakness = weakness;
    }

    public void setWeaknessAmount(float weaknessAmount) {
        this.weaknessAmount = weaknessAmount;
    }

    public String getName(){
        return name;
    }

    public void startCombat(){
        //TODO implement combat
        System.out.print("we are fighting");
    }

    public void converse(){
        //TODO implement conversation
        System.out.print("hello");
    }

    public void attacked(int strength, Weapon weapon){
        boolean crit = false;
        boolean isWeakTo = false;
        if (weapon.getDamageTypes().contains(weakness)){
            isWeakTo = true;
        } else {
        }
        dealDamage(strength, crit, isWeakTo);
    }

    private void dealDamage(float dmg, boolean crit, boolean isWeakTo){
        float damage = dmg;
        if (isWeakTo) { damage *= weaknessAmount; }
        currentHP -= damage;
        System.out.println("Hit for: " + damage + " - New HP is: " + currentHP);
    }

    public abstract void encountered();
}
