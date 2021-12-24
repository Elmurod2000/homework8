package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.BOOST, name);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            switch (RPG_Game.random.nextInt(2) + 1) {
                case 1:
                    heroes[i].setDamage(getDamage() + RPG_Game.random.nextInt(8) + 1);
                    System.out.println("Медик увеличил урон");
                    break;
                case 2:
                    heroes[i].setDamage(getDamage() + 0);
                    break;

            }
            break;
        }

    }
}
