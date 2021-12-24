package kg.geektech.game.players;

import java.util.Random;

public class Hacker extends Hero {

    public Hacker(int health, int damage, String name) {
        super(health, damage, SuperAbility.Zabiraet_Peredaet, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        Random random = new Random();
        boolean raund = random.nextBoolean();
        int volk = 100;
        for (int i = 0; i < heroes.length; i++) {
            if (raund == true && heroes[i].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - volk);
                heroes[i].setHealth(heroes[i].getHealth() + volk);
                System.out.println("Hacker zabral u Bossa 100 хп и передал герою " + heroes[i].getName());
                break;
            } else {
                System.out.println("Ne smojet zabrat");
                break;


            }


        }

    }
}
