package main.java.com.pixolestudios.items;

import main.java.com.pixolestudios.enums.AttackType;
import main.java.com.pixolestudios.enums.WeaponType;

public class Sword extends Weapon {
    public Sword(String name, AttackType... damageTypes) {
        super(name, WeaponType.SWORD, 100, 2, damageTypes);
    }
}
