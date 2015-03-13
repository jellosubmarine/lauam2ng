
public class Nupp {

    int asukoht = 0;
    String nimi;

    //get ja set meetodid
    public String getNimi() {
        return nimi;
    }

    public int getAsukoht() {
        return asukoht;
    }

    public void setAsukoht(int muut) {
        this.asukoht = asukoht + muut;
    }

    //konstruktor
    public Nupp(String nimi) {
        this.nimi = nimi;
    }
}
