package warrior.orcCharacter;

import warrior.Orc;

public class Boggart extends Orc {
  private final int MIN_HEALTH = 150;
  private final int BONUS_HEALTH = 250;
  private final int MIN_STRENGTH = 350;
  private final int BONUS_STRENGTH = 250;
  private final int MIN_DEXTERITY = 50;
  private final int BONUS_DEXTERITY = 50;
  private int luck = 5;

    public Boggart() {
      super();
      setStats();
    }
    public Boggart(String name) {
      super(name);
      setStats();
    }
    private void setStats() {
      super.setHealth(MIN_HEALTH, BONUS_HEALTH);
      super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
      super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
      super.setLuck(randNum.nextInt(luck) + 1); // 1 - 5
    }
}
