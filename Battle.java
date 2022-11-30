
import warrior.*;
import warrior.humanCharacter.*;
import warrior.elfCharacter.*;
import warrior.orcCharacter.*;
import warrior.dwarfCharacter.*;
import armour.*;
import weapon.*;
import utility.*;
import java.util.Scanner;
import java.util.Random;

public class Battle {
    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static String who = "player";
    private static boolean gameOver = false;
    private static Printer ink = new Printer();
    private static Validator validator = new Validator();
    private static Description description = new Description();

    // player objects
    private static Warrior pWarrior;
    private static Armour pArmour;
    private static Weapon pWeapon;

    // enemy objects
    private static Warrior eWarrior;
    private static Armour eArmour;
    private static Weapon eWeapon;

    public static void main(String[] args) {
        
        ink.welcome(); // Welcome

        ///////////////////////////////
        // Player Setup Section
        int pPick = validator.validateChoice("warrior");
        createWarrior(pPick, who);

        pPick = validator.validateChoice("armour");
        createArmour(pPick, who);

        pPick = validator.validateChoice("weapon");
        createWeapon(pPick, who);

        who = "enemy";
        // end player setup
        /////////////////////////


        /////////////////////////////
        // Enemy Setup Section
        // random number from 1 to 4
        int ePick = randNum.nextInt(4) + 1;
        createWarrior(ePick, who);
        System.out.println();
        System.out.println("Your enemy is " + eWarrior.getName());

        // random number from 1 to 4
        ePick = randNum.nextInt(4) + 1;
        createArmour(ePick, who);

        // random number from 1 to 4
        ePick = randNum.nextInt(4) + 1;
        createWeapon(ePick, who);

        who = "player";
        // end enemy setup
        ////////////////////////

        while(!gameOver) {
            if(who.equals("player")) {
                // players turn section
                int attackType = validator.validateChoice("attack");
                pWeapon.selectAttack(attackType);
                
                int damage = pWeapon.strike(pWeapon.selectAttack(attackType), 
                    pWarrior.getStrength(),
                    pWarrior.getDexterity(),
                    pWarrior.getLuck(),
                    pArmour.getDexterityCost());

                // reduce damage based on oppontents armour
                damage -= (eArmour.getDamageReduction() / 10);
                description.descStrikeResult(pWarrior.getName(), damage);
                
                // take the remaining damage and reduce the opponents 
                // health by that amount
                if(damage > 0) {
                    eWarrior.takeDamage(damage);
                }

                if(eWarrior.getHealth() <= 0) {
                    ink.printWinner(pWarrior.getName());
                    gameOver = true;
                }
                who = "enemy";
            } // player if
            else { // enemies turn section
                int attackType = randNum.nextInt(3) + 1;
                eWeapon.selectAttack(attackType);
                
                int damage = eWeapon.strike(
                    attackType, 
                    eWarrior.getStrength(),
                    eWarrior.getDexterity(),
                    eWarrior.getLuck(),
                    eArmour.getDexterityCost() );

                damage -= (pArmour.getDamageReduction() / 10);
                description.descStrikeResult(eWarrior.getName(), damage);
                
                if(damage > 0) {
                    pWarrior.takeDamage(damage);
                }

                if(pWarrior.getHealth() <= 0) {
                    ink.printWinner(eWarrior.getName());
                    gameOver = true;
                }
                who = "player";
            } //enemy else
        } // while
        ink.printGameOver();

    } // main()

    //////////////////////////
    // helper functions
    
    private static void createWarrior(int pick, String who) {
        
        switch(pick) {
            case 1: { // human
                if(who.equals("player")) {
                    int pPick = validator.validateChoice("humanCharacter");
                    pickHumanCharacter(pPick, who);
                }
                else {
                    pickHumanCharacter(pick, who);
                }
                break;
            }
            case 2: { // elf
                if(who.equals("player")) {
                    int pPick = validator.validateChoice("elfCharacter");
                    pickElfCharacter(pPick, who);
                }
                else {
                    pickElfCharacter(pick, who);
                }
                break;
            }
            case 3: { // orc
                if(who.equals("player")) {
                    int pPick = validator.validateChoice("orcCharacter");
                    pickOrcCharacter(pPick, who);
                }
                else {
                    pickOrcCharacter(pick, who);
                }
                break;
            }
            case 4: { // orc
                if(who.equals("player")) {
                    int pPick = validator.validateChoice("dwarfCharacter");
                    pickDwarfCharacter(pPick, who);
                }
                else {
                    pickDwarfCharacter(pick, who);
                }
                break;
            }
        }
    } // createWarrior()

    private static void pickHumanCharacter(int pick, String who) {
        String name = "";
        if(who.equals("player")) {
            ink.printNameRequest();
            name = input.nextLine();
        }

        switch(pick) {
            case 1: { // Knight
                if(who.equals("player"))
                    pWarrior = new Knight(name);
                else
                    eWarrior = new Knight();
                break;
            }
            case 2: { // Assassin
                if(who.equals("player"))
                    pWarrior = new Assassin(name);
                else
                    eWarrior = new Assassin();
                break;
            }
            case 3: { // Priest
                if(who.equals("player"))
                    pWarrior = new Priest(name);
                else
                    eWarrior = new Priest();
                break;
            }
            case 4: { // Archer
                if(who.equals("player"))
                    pWarrior = new Archer(name);
                else
                    eWarrior = new Archer();
                break;
            }
        }
    } // pickHumanCharacter()

    private static void pickElfCharacter(int pick, String who) {
        String name = "";
        if(who.equals("player")) {
            ink.printNameRequest();
            name = input.nextLine();
        }

        switch(pick) {
            case 1: { // Avariel
                if(who.equals("player"))
                    pWarrior = new Avariel(name);
                else
                    eWarrior = new Avariel();
                break;
            }
            case 2: { // ChristmasElf
                if(who.equals("player"))
                    pWarrior = new ChristmasElf(name);
                else
                    eWarrior = new ChristmasElf();
                break;
            }
            case 3: { // DarkElf
                if(who.equals("player"))
                    pWarrior = new DarkElf(name);
                else
                    eWarrior = new DarkElf();
                break;
            }
            case 4: { // Greyhawk
                if(who.equals("player"))
                    pWarrior = new Greyhawk(name);
                else
                    eWarrior = new Greyhawk();
                break;
            }
        }
    } // pickElfCharacter()

    private static void pickOrcCharacter(int pick, String who) {
        String name = "";
        if(who.equals("player")) {
            ink.printNameRequest();
            name = input.nextLine();
        }

        switch(pick) {
            case 1: { // Boggart
                if(who.equals("player"))
                    pWarrior = new Boggart(name);
                else
                    eWarrior = new Boggart();
                break;
            }
            case 2: { // Bugan
                if(who.equals("player"))
                    pWarrior = new Bugan(name);
                else
                    eWarrior = new Bugan();
                break;
            }
            case 3: { // Goblin
                if(who.equals("player"))
                    pWarrior = new Goblin(name);
                else
                    eWarrior = new Goblin();
                break;
            }
            case 4: { // Hobgoblin
                if(who.equals("player"))
                    pWarrior = new Hobgoblin(name);
                else
                    eWarrior = new Hobgoblin();
                break;
            }
        }
    } // pickOrcCharacter()

    private static void pickDwarfCharacter(int pick, String who) {
        String name = "";
        if(who.equals("player")) {
            ink.printNameRequest();
            name = input.nextLine();
        }

        switch(pick) {
            case 1: { // Bomber
                if(who.equals("player"))
                    pWarrior = new Bomber(name);
                else
                    eWarrior = new Bomber();
                break;
            }
            case 2: { // Gimli
                if(who.equals("player"))
                    pWarrior = new Gimli(name);
                else
                    eWarrior = new Gimli();
                break;
            }
            case 3: { // Gloin
                if(who.equals("player"))
                    pWarrior = new Gloin(name);
                else
                    eWarrior = new Gloin();
                break;
            }
            case 4: { // GotrekGurnisson
                if(who.equals("player"))
                    pWarrior = new GotrekGurnisson(name);
                else
                    eWarrior = new GotrekGurnisson();
                break;
            }
        }
    } // pickOrcCharacter()

    private static void createArmour(int pick, String who) {
        switch(pick) {
            case 1: { // Leather
                if(who.equals("player"))
                    pArmour = new Leather();
                else
                    eArmour = new Leather();
                break;
            }
            case 2: { // Chainmail
                if(who.equals("player"))
                    pArmour = new Chainmail();
                else
                    eArmour = new Chainmail();
                break;
            }
            case 3: { // Platemail
                if(who.equals("player"))
                    pArmour = new Platemail();
                else
                    eArmour = new Platemail();
                break;
            }
            case 4: { // Scalemail
                if(who.equals("player"))
                    pArmour = new Scalemail();
                else
                    eArmour = new Scalemail();
                break;
            }
        }
    } // createArmour()

    private static void createWeapon(int pick, String who) {
        switch(pick) {
            case 1: { // Sword
                if(who.equals("player"))
                    pWeapon = new Sword();
                else
                    eWeapon = new Sword();
                break;
            }
            case 2: { // Spear
                if(who.equals("player"))
                    pWeapon = new Spear();
                else
                    eWeapon = new Spear();
                break;
            }
            case 3: { // Axe
                if(who.equals("player"))
                    pWeapon = new Axe();
                else
                    eWeapon = new Axe();
                break;
            }
            case 4: { // Dagger
                if(who.equals("player"))
                    pWeapon = new Dagger();
                else
                    eWeapon = new Dagger();
                break;
            }
        }
    } // createWeapon()
} // class