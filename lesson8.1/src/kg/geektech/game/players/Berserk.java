package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    public Berserk(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int a = RPG_Game.random.nextInt(15) + 1 + this.getDamage();
        boss.setHealth(boss.getHealth() - a);
        System.out.println("Bersek damage "+a);

    }
}
