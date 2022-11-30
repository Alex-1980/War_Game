package weapon;

public class Axe extends Weapon {
    private int damageAmount = 100;
    private int damageBonus = 120;
    private int skillRating = 75;

    public Axe() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageAmount(damageAmount, damageBonus);
        super.setSkillRating(skillRating);
    }

    @Override 
    public int strike(int dex, int strength) {
        int damageAmount = 100;
        return damageAmount;
    }

}