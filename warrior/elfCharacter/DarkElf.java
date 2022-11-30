package warrior.elfCharacter;

import warrior.Elf;

public class DarkElf extends Elf {
  private final int MIN_HEALTH = 150;
  private final int BONUS_HEALTH = 230;
  private final int MIN_STRENGTH = 150;
  private final int BONUS_STRENGTH = 250;
  private final int MIN_DEXTERITY = 230;
  private final int BONUS_DEXTERITY = 180;
  private int luck = 25;

  public DarkElf() {
    super();
    setStats();
  }
  public DarkElf(String name) {
    super(name);
    setStats();
  }

  private void setStats() {
    super.setHealth(MIN_HEALTH, BONUS_HEALTH);
    super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
    super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
    super.setLuck(randNum.nextInt(luck) + 1); // 1 - 225
  }
}
