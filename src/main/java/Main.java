import java.util.Objects;
import java.util.Scanner;

public class Main {
    private Database db;

    private Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        m.db = new Database();
        m.startProgram();
    }

    public void startProgram() {
        int brugerValg = -1;

        while (brugerValg != 9) {
            System.out.println("""
                    Velkommen til Person database.
                    1. Opret superhelt
                    2. Vis superhelte
                    3. Find superhelt
                    9. Afslut
                    """);

            brugerValg = keyboard.nextInt();
            keyboard.nextLine(); // Håndtering af Scanner bug
            håndterBrugerValg(brugerValg);
        }
    }

    public void håndterBrugerValg(int brugerValg) {
        if (brugerValg == 1) {
            System.out.println("Indtast et navn på din superhelt");
            String navn = keyboard.nextLine();
            System.out.println("Indtast alder på din superhelt");
            int alder = keyboard.nextInt();
            System.out.println("Indtast om din superhelt er et menneske (J / N)");
            String menneske = keyboard.nextLine();
            boolean erMenneske = false;
            if (menneske.equals("ja")) {
                erMenneske = true;

            } else if (menneske.equals("nej")) {
                erMenneske = false;
            }
            System.out.println("Indtast højde på din superhelt");
            double højde = keyboard.nextDouble();
            System.out.println("Indtast vaegt på din superhelt");
            double vaegt = keyboard.nextDouble();
            System.out.println("Indtast din superhelts superkraft");
            String superkraft = keyboard.nextLine();
            System.out.println("Indtast din superhelts oprindelsesår");
            int oprindelsesår = keyboard.nextInt();
            System.out.println("Indtast din superhelts styrke");
            int styrke = keyboard.nextInt();

            db.tilføjSuperhelt(navn, alder, erMenneske, højde, vaegt, superkraft, oprindelsesår, styrke); // Crud operation
        } else if (brugerValg == 2) {
            db.visSuperhelte(); //cRud operation
        } else if (brugerValg == 3) {
            String navn = keyboard.nextLine();

            db.findSuperHero(navn); //cRud operation
        }


    }

}



