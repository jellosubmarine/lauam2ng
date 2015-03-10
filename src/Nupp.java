
public class Nupp {
    public String getNimi() {
        return nimi;
    }

    String nimi;

    public int getAsukoht() {
        return asukoht;
    }

    public void setAsukoht(int asukoht) {
        this.asukoht = asukoht;
    }

    int asukoht;

    public Nupp(String nimi, int asukoht) {
        this.nimi = nimi;
        this.asukoht = asukoht;
    }
}
