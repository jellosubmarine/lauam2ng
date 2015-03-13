import java.util.ArrayList;

public class Peaklass {
    public static void main(String[] args) {
        Täring T = new Täring();
        TavaVäli V1 = new TavaVäli();
        Väli2edasi V2 = new Väli2edasi();
        TavaVäli V3 = new TavaVäli();
        ArrayList<Object> Mängulaud = new ArrayList<Object>();
        Mängulaud.add(V1);
        Mängulaud.add(V2);
        Mängulaud.add(V3);
        Nupp Hetkmängja = new Nupp("Karl");
        while (Hetkmängja.asukoht<=3) {
            Hetkmängja.setAsukoht(T.vise());
            while (!(Mängulaud.get(Hetkmängja.asukoht) instanceof TavaVäli )){

            }

        }

        /*Täring y = new Täring();
        for (int i = 0; i < 10; i++) {
            System.out.println(y.vise());
        }*/
        

    }
}
