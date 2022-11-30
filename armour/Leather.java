package armour;

public class Leather extends Armour {
    private final int DEFENCE = 50;
    private final int MOBILITY_COST = 10;

    public Leather() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageReduction(DEFENCE);
        super.setDexterityCost(MOBILITY_COST);
    }
}
