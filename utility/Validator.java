package utility;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {

    private Printer printer = new Printer();
    private Scanner input = new Scanner(System.in);

    public Validator() {}
    
    // here is a sample validator method
    public int validateChoice(String type) {
        int choice = 0;
        boolean isBad = true;
        do {
            try {
                switch(type) {
                    case "warrior": {
                        printer.printWarriorMenu();
                        break;
                    }
                    case "humanCharacter": {
                        printer.printHumanCharacterMenu();
                        break;
                    }
                    case "elfCharacter": {
                        printer.printElfCharacterMenu();
                        break;
                    }
                    case "orcCharacter": {
                        printer.printOrcCharacterMenu();
                        break;
                    }
                    case "dwarfCharacter": {
                        printer.printDwarfCharacterMenu();
                        break;
                    }
                    case "armour": {
                        printer.printArmourMenu();
                        break;
                    }
                    case "weapon": {
                        printer.printWeaponMenu();
                        break;
                    }
                    case "attack": {
                        printer.printAttackMenu();
                        break;
                    }
                }
                choice = input.nextInt();
                if(choice >= 1 && choice <= 4) {
                    isBad = false;
                }
            } // try
            catch(InputMismatchException e) {
                input.nextLine();
                isBad = true;
            } // catch
        } while(isBad == true);
        return choice;
    } // validateChoice()
} // class