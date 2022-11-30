package warrior.humanCharacter;

import warrior.Human;

public class Knight extends Human {
    private final int MIN_HEALTH = 200;
    private final int BONUS_HEALTH = 250;
    private final int MIN_STRENGTH = 50;
    private final int BONUS_STRENGTH = 150;
    private final int MIN_DEXTERITY = 50;
    private final int BONUS_DEXTERITY = 100;
    private int luck = 15;
  
  public Knight() {
    super();
    setStats();
  }

  public Knight(String name) {
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
