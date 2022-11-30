package warrior.dwarfCharacter;

import warrior.Dwarf;

public class Bomber extends Dwarf {
  private final int MIN_HEALTH = 120;
  private final int BONUS_HEALTH = 230;
  private final int MIN_STRENGTH = 120;
  private final int BONUS_STRENGTH = 250;
  private final int MIN_DEXTERITY = 90;
  private final int BONUS_DEXTERITY = 90;
  private int luck = 10;

  public Bomber() {
    super();
    setStats();
  }

  public Bomber(String name) {
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
