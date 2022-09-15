import java.util.ArrayList;

public class Database {

    private ArrayList<Superhelt> superhelte = new ArrayList<>();
    private ArrayList<Superhelt> soegeresultat = new ArrayList<>();

    public Superhelt findSuperHero(String navn) {
        // find superheroes, hvis supernavn er lig med navn
        for (Superhelt s : superhelte) { // superheroes er arraylisten
            if (s.getNavn().equals(navn)) {
                return s;
            }
        }
        // ingen fundet
        return null;
    }
    public void tilføjSuperhelt(String navn, int alder, boolean erMenneske, double højde, double vaegt, String superkraft, int oprindelsesår, int styrke){
        superhelte.add(new Superhelt(navn, alder, erMenneske, højde, vaegt, superkraft, oprindelsesår, styrke));

    }


    public void visSuperhelte() {
        for(Superhelt superhelt: superhelte){
            System.out.println(superhelt);
        }
    }
}
