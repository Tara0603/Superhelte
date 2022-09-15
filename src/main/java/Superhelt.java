public class Superhelt {
    private String navn;
    private int alder;
    private boolean erMenneske;
    private double højde;
    private double vaegt;
    private String superkraft;
    private int oprindelsesår;
    private int styrke;

    public Superhelt(String navn, int alder, boolean erMenneske, double højde, double vaegt, String superkraft, int oprindelsesår, int styrke) {
        this.navn = navn;
        this.alder = alder;
        this.erMenneske = erMenneske;
        this.højde = højde;
        this.vaegt = vaegt;
        this.superkraft = superkraft;
        this.oprindelsesår = oprindelsesår;
        this.styrke = styrke;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public boolean isErMenneske() {
        return erMenneske;
    }

    public void setErMenneske(boolean erMenneske) {
        this.erMenneske = erMenneske;
    }

    public double getHøjde() {
        return højde;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public double getVaegt() {
        return vaegt;
    }

    public void setVaegt(double vaegt) {
        this.vaegt = vaegt;
    }

    public String getSuperkraft() {
        return superkraft;
    }

    public void setSuperkraft(String superkraft) {
        this.superkraft = superkraft;
    }

    public int getOprindelsesår() {
        return oprindelsesår;
    }

    public void setOprindelsesår(int oprindelsesår) {
        this.oprindelsesår = oprindelsesår;
    }

    public int getStyrke() {
        return styrke;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return "navn='" + navn + '\'' +
                ", alder=" + alder +
                ", erMenneske=" + erMenneske +
                ", højde=" + højde +
                ", vaegt=" + vaegt +
                ", superkraft='" + superkraft + '\'' +
                ", oprindelsesår=" + oprindelsesår +
                ", styrke=" + styrke +
                '}';
    }
}
