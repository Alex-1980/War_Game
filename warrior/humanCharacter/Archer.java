package warrior.humanCharacter;

import warrior.Human;

public class Archer extends Human {
    private final int MIN_HEALTH = 120;
    private final int BONUS_HEALTH = 150;
    private final int MIN_STRENGTH = 50;
    private final int BONUS_STRENGTH = 150;
    private final int MIN_DEXTERITY = 60;
    private final int BONUS_DEXTERITY = 120;
    private int luck = 20;
  
  public Archer() {
    super();
    setStats();
  }

  public Archer(String name) {
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
