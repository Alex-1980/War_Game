package weapon;

public class Spear extends Weapon {
    private int damageAmount = 75;
    private int damageBonus = 90;
    private int skillRating = 50;

    public Spear() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageAmount(damageAmount, damageBonus);
        super.setSkillRating(skillRating);
    }

    @Override 
    public int strike(int dex, int strength) {
        int damageAmount = 75;
        return damageAmount;
    }

}
