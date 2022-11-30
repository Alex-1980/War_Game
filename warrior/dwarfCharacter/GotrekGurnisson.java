package warrior.dwarfCharacter;

import warrior.Dwarf;

public class GotrekGurnisson extends Dwarf {
  private final int MIN_HEALTH = 140;
  private final int BONUS_HEALTH = 230;
  private final int MIN_STRENGTH = 110;
  private final int BONUS_STRENGTH = 180;
  private final int MIN_DEXTERITY = 110;
  private final int BONUS_DEXTERITY = 100;
  private int luck = 15;

  public GotrekGurnisson() {
    super();
    setStats();
  }

  public GotrekGurnisson(String name) {
    super(name);
    setStats();
  }

  private void setStats() {
    super.setHealth(MIN_HEALTH, BONUS_HEALTH);
    super.setStrength(MIN_STRENGTH, BONUS_STRENGTH);
    super.setDexterity(MIN_DEXTERITY, BONUS_DEXTERITY);
    super.setLuck(randNum.nextInt(luck) + 1); // 1 - 15
  }
}
