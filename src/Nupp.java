
public class Nupp {

    int asukoht = 0;
    String nimi;

    //get ja set meetodid
    public String getNimi() {
        return nimi;
    }

    public int getAsukoht() {

        /*if(asukoht >= 41) {
            return 41;
        }*/

        return asukoht;
    }

    public void setAsukoht(int muut) {
        this.asukoht = asukoht + muut;
    }

    @Override
    public String toString() {
        return nimi ;
    }

    //konstruktor
    public Nupp(String nimi) {
        this.nimi = nimi;
    }
}
