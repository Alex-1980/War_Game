package weapon;

public class Sword extends Weapon {
    private int damageAmount = 50;
    private int damageBonus = 70;
    private int skillRating = 25;

    public Sword() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageAmount(damageAmount, damageBonus);
        super.setSkillRating(skillRating);
    }

    @Override 
    public int strike(int dex, int strength) {
        int damageAmount = 50;
        return damageAmount;
    }
    
}