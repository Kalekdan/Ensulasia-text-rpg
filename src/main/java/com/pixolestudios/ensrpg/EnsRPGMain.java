package main.java.com.pixolestudios.ensrpg;

import main.java.com.pixolestudios.npcs.Bandit;
import main.java.com.pixolestudios.npcs.Enemy;

public class EnsRPGMain {
    private EnsRPGMain() {
    }

    public static void main(String[] args){
        Player player = new Player();

        Enemy enemy = new Bandit("Bob", 100);
        player.attack(enemy);
    }
}
