package armour;

public abstract class Armour {
    protected int damageReduction;
    protected int dexterityCost;

    public Armour() { }

    // Damage Reduction Methods
    protected void setDamageReduction(int amount) {
        this.damageReduction = amount;
    }
    public int getDamageReduction() {
        return damageReduction;
    }

    // Dexterity Cost Methods
    protected void setDexterityCost(int amount) {
        this.dexterityCost = amount;
    }
    public int getDexterityCost() {
        return dexterityCost;
    }
}
