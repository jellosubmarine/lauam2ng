import java.util.ArrayList;
import java.util.Collections;
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

        for (int j = 1; j <= 20; j++){ //Loob 20 tavavälja ja paneb mänguvälja
            mänguväli.add(new Väli());
        }
        for (int j = 1; j <= 10; j++){ //Loob 10 väli2edasi ja paneb mänguvälja
            mänguväli.add(new Väli2edasi());
        }
        for (int j = 1; j <= 10; j++){ //Loob 10 Uusveeretus ja paneb mänguvälja
            mänguväli.add(new Uusveeretus());
        }
        Collections.shuffle(mänguväli); //Ajab mänguvälja segamini
        mänguväli.add(0, new Väli()); // Lisab mänguvälja algusesse tavavälja, et 1. ruut oleks neutraalne
        System.out.println(mänguväli.size());
        System.out.println(mänguväli);
        int k = 0;
        while(true){
            int veeretus = y.vise();
            System.out.println(mängijad.get(k) + " veeretas " + veeretus);
            mängijad.get(k).setAsukoht(veeretus);
            if(mängijad.get(k).getAsukoht() >= mänguväli.size()){
                System.out.println("Võitis " + mängijad.get(k));
                System.exit(0);
            }
            System.out.println("Ta on nüüd " + mängijad.get(k).getAsukoht() + ". väljal.");
            while (!(mänguväli.get(mängijad.get(k).asukoht) instanceof Väli)){
                if (mänguväli.get(mängijad.get(k).asukoht) instanceof Väli2edasi){
                    Väli2edasi.liiguedasi(mängijad.get(k));
                    System.out.println("Ta on nüüd " + mängijad.get(k).getAsukoht() + ". väljal.");
                }
                else if (mänguväli.get(mängijad.get(k).asukoht) instanceof Uusveeretus){
                    veeretus = y.vise();
                    System.out.println(mängijad.get(k) + " veeretas " + veeretus);
                    mängijad.get(k).setAsukoht(veeretus);
                    System.out.println("Ta on nüüd " + mängijad.get(k).getAsukoht() + ". väljal.");
                }
                if(mängijad.get(k).getAsukoht() >= mänguväli.size()){
                    System.out.println("Võitis " + mängijad.get(k));
                    System.exit(0);
                }
            }

            k++;
            if(k == mängijad.size()){
                k = 0;
            }

        }


    }



}
