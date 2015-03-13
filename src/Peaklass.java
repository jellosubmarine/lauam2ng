import java.util.ArrayList;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        Täring y = new Täring();  //täringu tegemine

        ArrayList<Nupp> mängijad = new ArrayList<Nupp>(); //mängijad
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta mängijate arv");
        int limiit = sc.nextInt(); //mängijate arv
        int i = 0;

        while(i < limiit) { //mängijate sisestamine
            System.out.println("Sisesta mängija nimi");
            String nimi = sc.next();
            mängijad.add(new Nupp(nimi));
            i++;
        }

        ArrayList<Object> mänguväli = new ArrayList<Object>();

        for (int j = 1; i <= 40; i++){ //teeb mänguvälja suurusega 40
            mänguväli.add(new Väli());
        }
        int k = 0;
        System.out.println(mänguväli.size());
        while(true){
            int veeretus = y.vise();
            System.out.println(mängijad.get(k) + " veeretas " + veeretus);
            mängijad.get(k).setAsukoht(veeretus);
            System.out.println("Ta on nüüd " + mängijad.get(k).getAsukoht() + ". väljal.");
            if(mängijad.get(k).getAsukoht() >= mänguväli.size()){
                System.out.println("Võitis " + mängijad.get(k));
                break;
            }
            k++;
            if(k == mängijad.size()){
                k = 0;
            }

        }


    }

}
