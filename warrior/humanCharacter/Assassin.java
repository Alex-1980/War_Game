package warrior.humanCharacter;

import warrior.Human;

public class Assassin extends Human {
    private final int MIN_HEALTH = 150;
    private final int BONUS_HEALTH = 200;
    private final int MIN_STRENGTH = 30;
    private final int BONUS_STRENGTH = 120;
    private final int MIN_DEXTERITY = 70;
    private final int BONUS_DEXTERITY = 150;
    private int luck = 15;
  
  public Assassin() {
    super();
    setStats();
  }

  public Assassin(String name) {
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
