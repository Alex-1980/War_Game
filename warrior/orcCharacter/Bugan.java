package warrior.orcCharacter;

import warrior.Orc;

public class Bugan extends Orc {
  private final int MIN_HEALTH = 200;
  private final int BONUS_HEALTH = 180;
  private final int MIN_STRENGTH = 300;
  private final int BONUS_STRENGTH = 300;
  private final int MIN_DEXTERITY = 40;
  private final int BONUS_DEXTERITY = 45;
  private int luck = 5;

    public Bugan() {
      super();
      setStats();
    }
    public Bugan(String name) {
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
