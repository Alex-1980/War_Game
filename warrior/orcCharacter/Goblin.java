package warrior.orcCharacter;

import warrior.Orc;

public class Goblin extends Orc {
  private final int MIN_HEALTH = 170;
  private final int BONUS_HEALTH = 230;
  private final int MIN_STRENGTH = 320;
  private final int BONUS_STRENGTH = 260;
  private final int MIN_DEXTERITY = 45;
  private final int BONUS_DEXTERITY = 45;
  private int luck = 10;

    public Goblin() {
      super();
      setStats();
    }
    public Goblin(String name) {
      super(name);
      setStats();
    }
    private void setStats() {
      super.setHealth(MIN_HEALTH, BONUS_HEALTH);
      super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
      super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
      super.setLuck(randNum.nextInt(luck) + 1); // 1 - 10
    }
}
