package warrior.elfCharacter;

import warrior.Elf;

public class Greyhawk extends Elf {
  private final int MIN_HEALTH = 150;
  private final int BONUS_HEALTH = 200;
  private final int MIN_STRENGTH = 120;
  private final int BONUS_STRENGTH = 230;
  private final int MIN_DEXTERITY = 250;
  private final int BONUS_DEXTERITY = 200;
  private int luck = 20;

  public Greyhawk() {
    super();
    setStats();
  }
  public Greyhawk(String name) {
    super(name);
    setStats();
  }

  private void setStats() {
    super.setHealth(MIN_HEALTH, BONUS_HEALTH);
    super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
    super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
    super.setLuck(randNum.nextInt(luck) + 1); // 1 - 20
  }
}
