package warrior;

import utility.*;
import java.util.Random;

public abstract class Warrior {

    private Namer namer = new Namer();
    protected Random randNum = new Random();
    protected int health;
    protected int strength;
    protected int dexterity;
    private String name;
    private int luck;
 
    public Warrior() { 
        this.name = namer.getName();
    }

    public Warrior(String name) {
        this.name = name;
    }

    public void setHealth(int min, int bonus) {
        this.health = randNum.nextInt(bonus) + min;
    }

    public int getHealth() {
        return health;
    }

    public void setStrength(int min, int bonus) {
        this.strength = randNum.nextInt(bonus) + min;
    }
    public int getStrength() {
        return strength;
    }

    public void setDexterity(int min, int bonus) {
        this.dexterity = randNum.nextInt(bonus) + min;
    }
    public int getDexterity() {
        return dexterity;
    }

    public void takeDamage(int amount) {
        this.health -= amount;
    }
    public String getName() {
        return this.name;
    }
    public void setLuck(int val) {
        this.luck = val;
    }
    public int getLuck() {
        return this.luck;
    }
}
