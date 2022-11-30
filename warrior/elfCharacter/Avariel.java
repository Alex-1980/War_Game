package warrior.elfCharacter;

import warrior.Elf;

public class Avariel extends Elf {
  private final int MIN_HEALTH = 200;
  private final int BONUS_HEALTH = 250;
  private final int MIN_STRENGTH = 100;
  private final int BONUS_STRENGTH = 200;
  private final int MIN_DEXTERITY = 250;
  private final int BONUS_DEXTERITY = 200;
  private int luck = 25;

  public Avariel() {
    super();
    setStats();
  }
  public Avariel(String name) {
    super(name);
    setStats();
  }

  private void setStats() {
    super.setHealth(MIN_HEALTH, BONUS_HEALTH);
    super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
    super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
    super.setLuck(randNum.nextInt(luck) + 1); // 1 - 25
  }
}
