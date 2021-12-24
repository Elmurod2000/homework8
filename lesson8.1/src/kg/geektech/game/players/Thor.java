package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {
    public Thor(int health, int damage,String name) {
        super(health, damage, SuperAbility.Oglushil, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        switch (RPG_Game.random.nextInt(2) + 1) {
            case 1:
                boss.setDamage(0);
                System.out.println("Бос оглушен");
                break;
            case 2:
                boss.setDamage(50);
                break;
            default:

        }
    }
}
