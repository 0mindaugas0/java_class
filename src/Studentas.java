public class Studentas {
    private  String vardas;
    private  String pavarde;
    private int klase;
    private double pazymys;

    public Studentas(){

    }
    public Studentas(String vardas, String pavarde, int klase, double pazymys) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymys = pazymys;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public double getPazymys() {
        return pazymys;
    }

    public void setPazymys(double pazymys) {
        this.pazymys = pazymys;
    }

    @Override
    public String toString() {
        return "Studentas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", klase=" + klase +
                ", pazymys=" + pazymys +
                '}';
    }
}
