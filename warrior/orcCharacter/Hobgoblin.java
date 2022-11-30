package warrior.orcCharacter;

import warrior.Orc;

public class Hobgoblin extends Orc {
  private final int MIN_HEALTH = 140;
  private final int BONUS_HEALTH = 270;
  private final int MIN_STRENGTH = 330;
  private final int BONUS_STRENGTH = 240;
  private final int MIN_DEXTERITY = 30;
  private final int BONUS_DEXTERITY = 60;
  private int luck = 10;

    public Hobgoblin() {
      super();
      setStats();
    }
    public Hobgoblin(String name) {
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
