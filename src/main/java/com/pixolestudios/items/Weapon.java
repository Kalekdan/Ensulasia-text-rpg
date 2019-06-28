package main.java.com.pixolestudios.items;

import main.java.com.pixolestudios.enums.AttackType;
import main.java.com.pixolestudios.enums.WeaponType;

import java.util.ArrayList;

public abstract class Weapon extends Item {

    private WeaponType type;
    private ArrayList<AttackType> damageTypes = new ArrayList<AttackType>();

    protected Weapon(String name, WeaponType type, float value, float weight, AttackType... damageTypes){
        super(name, value, weight);
        this.type = type;
        for (AttackType dmgType: damageTypes){
            this.damageTypes.add(dmgType);
        }
    }

    public ArrayList<AttackType> getDamageTypes() {
        return damageTypes;
    }
}
