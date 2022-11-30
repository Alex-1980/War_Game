
package utility;

public class Printer {

    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
  
    // Declaring the color a Custom declaration
    public static final String ANSI_PURPLE_BOLD = "\033[1;35m";
    public static final String ANSI_RED = "\033[0;31m";
    public static final String ANSI_RED_BOLD = "\033[1;31m";
    public static final String ANSI_GREEN = "\033[0;32m";
    public static final String ANSI_YELLOW = "\033[0;33m";
    public static final String ANSI_YELLOW_BOLD = "\033[1;33m";
    public static final String ANSI_BLUE = "\033[0;34m";
    public static final String ANSI_BLUE_BOLD = "\033[1;34m";
    public static final String ANSI_CYAN = "\033[0;36m";

    public void welcome() { 
        System.out.println(ANSI_PURPLE_BOLD + "__          __  _                              _            _   _             __          __         _ ");
        System.out.println("* *        / / | |                            | |          | | | |            * *        / /        | |");
        System.out.println(" * *  /*  / /__| | ___ ___  _ __ ___   ___    | |_ ___     | |_| |__   ___     * *  /*  / /_ _ _ __ | |");
        System.out.println("  * */  */ / _ * |/ __/ _ *| '_ ` _ * / _ *   | __/ _ *    | __| '_ * / _ *     * */  */ / _` | '__|| |");
        System.out.println("   *  /*  /  __/ | (_| (_) | | | | | |  __/   | || (_) |   | |_| | | |  __/      *  /*  / (_| | |   |_|");
        System.out.println("    */  */ *___|_|*___*___/|_| |_| |_|*___|    *__*___/     *__|_| |_|*___|       */  */ *__,_|_|   (_)\n" + ANSI_RESET);
    } // welcome()

    public void printWarriorMenu() {
        System.out.println(ANSI_GREEN + "//////////////////////////");
        System.out.println("  Pick a warrior!");
        System.out.println("  1) Human");
        System.out.println("  2) Elf");
        System.out.println("  3) Orc");
        System.out.println("  4) Dwarf");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printHumanCharacterMenu() {
        System.out.println(ANSI_GREEN + "//////////////////////////");
        System.out.println("  Pick a Charater!");
        System.out.println("  1) Knight");
        System.out.println("  2) Assassin");
        System.out.println("  3) Priest");
        System.out.println("  4) Archer");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printElfCharacterMenu() {
        System.out.println(ANSI_GREEN + "//////////////////////////");
        System.out.println("  Pick a Charater!");
        System.out.println("  1) Avariel");
        System.out.println("  2) ChristmasElf");
        System.out.println("  3) DarkElf");
        System.out.println("  4) Greyhawk");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printOrcCharacterMenu() {
        System.out.println(ANSI_GREEN + "//////////////////////////");
        System.out.println("  Pick a Charater!");
        System.out.println("  1) Boggart");
        System.out.println("  2) Bugan");
        System.out.println("  3) Goblin");
        System.out.println("  4) Hobgoblin");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printDwarfCharacterMenu() {
        System.out.println(ANSI_GREEN + "//////////////////////////");
        System.out.println("  Pick a Charater!");
        System.out.println("  1) Bomber");
        System.out.println("  2) Gimli");
        System.out.println("  3) Gloin");
        System.out.println("  4) GotrekGurnisson");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printArmourMenu() {
        System.out.println(ANSI_YELLOW + "\n//////////////////////////");
        System.out.println("Pick your armour!");
        System.out.println("1) Leather");
        System.out.println("2) Chainmail");
        System.out.println("3) Platemail");
        System.out.println("4) Scalemail");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printWeaponMenu() {
        System.out.println(ANSI_BLUE + "\n//////////////////////////");
        System.out.println("Pick your weapon!");
        System.out.println("1) Dagger");
        System.out.println("2) Sword");
        System.out.println("3) Spear");
        System.out.println("4) Axe");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printAttackMenu() {
        System.out.println(ANSI_RED + "\n//////////////////////////");
        System.out.println("Pick your attack:");
        System.out.println("1) Light");
        System.out.println("2) Basic");
        System.out.println("3) Medium");
        System.out.println("4) Heavy");
        System.out.println("///////////////////" + ANSI_RESET);
    }

    public void printStrikeMiss(String who, int damage) {
        System.out.printf(ANSI_RED_BOLD + "\n%s swings and misses.\n" + ANSI_RESET, who, damage);
    }

    public void printStrikeHit(String who, int damage) {
        System.out.printf(ANSI_YELLOW_BOLD + "\n%s swings and hits for %d damage!\n" + ANSI_RESET, who, damage);
    }

    public void printWinner(String who) {
        System.out.println();
        System.out.printf(ANSI_BLUE_BOLD + "%s Wins!" + ANSI_RESET, who);
    }
    public void printGameOver() {
        System.out.println();
        System.out.println(ANSI_RED_BOLD + "  ______                                            ______                                       __ ");
        System.out.println(" /      *                                          /      *                                     /  |");
        System.out.println("/$$$$$$  |  ______   _____  ____    ______        /$$$$$$  | __     __  ______    ______        $$ |");
        System.out.println("$$ | _$$/  /      * /     /    *  /      *        $$ |  $$ |/  *   /  |/      *  /      *       $$ |");
        System.out.println("$$ |/    | $$$$$$  |$$$$$$ $$$$  |/$$$$$$  |      $$ |  $$ |$$  * /$$//$$$$$$  |/$$$$$$  |      $$ |");
        System.out.println("$$ |$$$$ | /    $$ |$$ | $$ | $$ |$$    $$ |      $$ |  $$ | $$  /$$/ $$    $$ |$$ |  $$/       $$/ ");
        System.out.println("$$ *__$$ |/$$$$$$$ |$$ | $$ | $$ |$$$$$$$$/       $$ *__$$ |  $$ $$/  $$$$$$$$/ $$ |             __ ");
        System.out.println("$$    $$/ $$    $$ |$$ | $$ | $$ |$$       |      $$    $$/    $$$/   $$       |$$ |            /  |");
        System.out.println(" $$$$$$/   $$$$$$$/ $$/  $$/  $$/  $$$$$$$/        $$$$$$/      $/     $$$$$$$/ $$/             $$/ " + ANSI_RESET);

        System.out.print(ANSI_BLUE_BOLD + "\n\nThanks for playing,\n" +
            "\"don't forget to like and subscribe\"" + ANSI_RESET);
    }
    public void printNameRequest() {
        System.out.print(ANSI_CYAN + "\nWhat is your name?\n "+ ANSI_RESET);
    }
}