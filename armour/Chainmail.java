package armour;

public class Chainmail extends Armour {
    private final int DEFENCE = 75;
    private final int MOBILITY_COST = 50;

    public Chainmail() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageReduction(DEFENCE);
        super.setDexterityCost(MOBILITY_COST);
    }
}
