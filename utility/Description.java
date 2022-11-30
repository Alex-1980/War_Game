package utility;

public class Description {

  private Printer printer = new Printer();
  
  public Description() {}

  public void descStrikeResult(String who, int damage) {
    if(damage <= 0) {
      printer.printStrikeMiss(who, damage);
    }
    else {
      printer.printStrikeHit(who, damage);
    }
  }
}