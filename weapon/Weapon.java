package weapon;

import java.util.Random;

public abstract class Weapon {
    private Random randNum = new Random();
    private int baseDamage;
    private int skillRating;
    private final int CHANCE = 100;
    private int roll; // the number rolled
    private int hit; // the number to hit

    public Weapon() { }

    protected void setDamageAmount(int amount, int bonus) {
        this.baseDamage = randNum.nextInt(bonus) + amount;
    }
    public int getDamageAmount() {
        return baseDamage;
    }
    protected void setSkillRating(int amount) {
        this.skillRating = amount;
    }
    public int getSkillRating() {
        return skillRating;
    }

    public abstract int strike(int dex, int strength);

    public int selectAttack(int select) {
        switch(select) {
            case 1: hit += 25; // light attack 

            case 2: hit += 15; // basic attack

            case 3: hit -= 10; // medium attack

            case 4: hit -= 20; // heavy attack
        }
        return hit;
    }

    // strike method!
    // attack type 1 OR 2, player strength
    // player dexterity, armour dex cost
    // weapon skill rating
    public int strike(int hit, int strength, 
        int dexterity, int luck, int dexCost) {

        int damage = 0;

        // the players dexterity helps the hit chance
        hit += dexterity / 10;
        
        // the players dexCost hurts the hit chance
        hit -= dexCost / 10;

        // add the players luck
        hit += luck;

        // the weapons skill rating hurts the hit chance
        hit -= (skillRating / 10);

        // roll the die
        roll = randNum.nextInt(CHANCE) + 1;

        if(roll >= hit) { // hit
            damage = baseDamage + (strength / 10);
        }
        else { // miss
            damage = 0;
        }
        return damage;
    }
}