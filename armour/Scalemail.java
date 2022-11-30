package armour;

public class Scalemail extends Armour {
    private final int DEFENCE = 150;
    private final int MOBILITY_COST = 70;

    public Scalemail() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageReduction(DEFENCE);
        super.setDexterityCost(MOBILITY_COST);
    }
}
