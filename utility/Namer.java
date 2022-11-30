package utility;

public class Namer {
    private String[] names = {
        "Vlad the Impaler", 
        "Eric the Evil", 
        "Othello the Insane", 
        "Leather Face", 
        "Cheater of Death", 
        "Haggar of Horror",
        "Dagger of Ferocity", 
        "Sampson the Slayer", 
        "Andy the Axe of Anxiety" };

    public Namer() {} // empty constructor

    public String getName() {
        int idx = (int) (Math.random() * names.length);
        return names[idx];
    } // getName()
} // class Namer