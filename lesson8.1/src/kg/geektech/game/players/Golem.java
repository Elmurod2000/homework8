package kg.geektech.game.players;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.Blok_Urona, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int uronFromBoss = boss.getDamage()/5;
        int liveHeroes = 0;
        if (this.getHealth() > 0) {
            for (int i = 0; i < heroes.length; i++){
                if (heroes[i].getHealth() >0 && heroes[i]!=this){
                    liveHeroes++;
                    heroes[i].setHealth(heroes[i].getHealth()+uronFromBoss);
                }
            }
            this.setHealth(this.getHealth()-uronFromBoss*liveHeroes);
            System.out.println("Голем получает урон "+uronFromBoss*liveHeroes);
        }
    }
}