package warrior.dwarfCharacter;

import warrior.Dwarf;

public class Gloin extends Dwarf {
  private final int MIN_HEALTH = 150;
  private final int BONUS_HEALTH = 250;
  private final int MIN_STRENGTH = 100;
  private final int BONUS_STRENGTH = 200;
  private final int MIN_DEXTERITY = 100;
  private final int BONUS_DEXTERITY = 100;
  private int luck = 10;

  public Gloin() {
    super();
    setStats();
  }

  public Gloin(String name) {
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
