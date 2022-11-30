package warrior.humanCharacter;

import warrior.Human;

public class Priest extends Human {
    private final int MIN_HEALTH = 150;
    private final int BONUS_HEALTH = 230;
    private final int MIN_STRENGTH = 70;
    private final int BONUS_STRENGTH = 180;
    private final int MIN_DEXTERITY = 50;
    private final int BONUS_DEXTERITY = 100;
    private int luck = 20;
  
  public Priest() {
    super();
    setStats();
  }

  public Priest(String name) {
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
