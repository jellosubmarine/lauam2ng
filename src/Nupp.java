
public class Nupp { //Mängija nupp, kus on salvestatud mängija nimi ja asukoht.

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

    @Override
    public String toString() {
        return nimi ;
    }

    //konstruktor
    public Nupp(String nimi) {
        this.nimi = nimi;
    }
}
