
public class Nupp {

    int asukoht;
    String nimi;

    //get ja set meetodid
    public String getNimi() {
        return nimi;
    }

    public int getAsukoht() {
        return asukoht;
    }

    public void setAsukoht(int asukoht) {
        this.asukoht = asukoht;
    }

    //konstruktor
    public Nupp(String nimi, int asukoht) {
        this.nimi = nimi;
        this.asukoht = asukoht;
    }
}
