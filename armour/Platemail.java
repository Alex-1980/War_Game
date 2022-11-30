package armour;

public class Platemail extends Armour {
    private final int DEFENCE = 125;
    private final int MOBILITY_COST = 75;

    public Platemail() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageReduction(DEFENCE);
        super.setDexterityCost(MOBILITY_COST);
    }
}
