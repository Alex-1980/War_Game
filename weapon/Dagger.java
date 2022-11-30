package weapon;

public class Dagger extends Weapon {
    private int damageAmount = 40;
    private int damageBonus = 50;
    private int skillRating = 15;

    public Dagger() {
        super();
        setStats();
    }

    private void setStats() {
        super.setDamageAmount(damageAmount, damageBonus);
        super.setSkillRating(skillRating);
    }

    @Override 
    public int strike(int dex, int strength) {
        int damageAmount = 30;
        return damageAmount;
    }

  }