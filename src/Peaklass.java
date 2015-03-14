import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) {
        Täring y = new Täring();  //täringu tegemine
        String enter; //inputi kontrollimine

        System.out.println("Tere tulemast mängima vana head lauamängu!");
        System.out.println("This shit is made by Markus Veinla and Madis Kaspar Nigol\n");
        ArrayList<Nupp> mängijad = new ArrayList<Nupp>(); //mängijad
        Scanner sc = new Scanner(System.in);
        System.out.print("Sisesta mängijate arv: ");
        int limiit = sc.nextInt(); //mängijate arv
        int i = 0;

        while(i < limiit) { //mängijate sisestamine
            System.out.print("Sisesta " + (i+1) + ". mängija nimi: ");
            String nimi = sc.next();
            mängijad.add(new Nupp(nimi));
            i++;
        }

        ArrayList<Object> mänguväli = new ArrayList<Object>();

        for (int j = 1; j <= 20; j++){ //Loob 20 tavavälja ja paneb mänguväljale
            mänguväli.add(new Väli());
        }
        for (int j = 1; j <= 10; j++){ //Loob 10 väli2edasi ja paneb mänguväljale
            mänguväli.add(new Väli2edasi());
        }
        for (int j = 1; j <= 10; j++){ //Loob 10 Uusveeretus ja paneb mänguväljale
            mänguväli.add(new Uusveeretus());
        }
        for (int j = 1; j<= 10; j++){
            mänguväli.add(new Väli3tagasi()); //Loob 10 Väli3tagasi ja paneb mänguväljale
        }
        Collections.shuffle(mänguväli); //Ajab mänguvälja segamini
        mänguväli.add(0, new Väli()); // Lisab mänguvälja algusesse tavavälja, et 1. ruut oleks neutraalne
        System.out.println("Mänguvälja suurus on " + mänguväli.size());
        int k = 0;

        boolean checksiffirst = true; //see on selleks, et ta kohe esimest ringi ei läheks automaatselt tegema

        while(true){
            //inputi kontrollimine
            if(!checksiffirst) { //check below
                System.out.println("Vajuta Enter, et veeretada! Sisesta 'kill', et programm sulgeda");
            }
            enter = sc.nextLine();
            if (enter.equals("")) {
                if(checksiffirst){ //by default on esimene sisestus "" ja ta veeretab automaatselt
                    checksiffirst = false;
                    continue;
                }
            }
            else if(enter.equals("kill")){
                System.out.println("Tapsid mängu");
                break;
            }
            else{
                System.out.println("Sisestus ei sobi");
                continue;
            }

            Nupp hetkmängija = mängijad.get(k);
            int veeretus = y.vise();
            System.out.println(hetkmängija + " veeretas " + veeretus);
            hetkmängija.setAsukoht(veeretus);
            if(hetkmängija.getAsukoht() >= mänguväli.size()){ //kontrollib kas mängija võitis
                System.out.println("Võitis " + hetkmängija);
                System.exit(0);
            }
            System.out.println("Ta on nüüd " + hetkmängija.getAsukoht() + ". väljal.");
            while (!(mänguväli.get(hetkmängija.asukoht) instanceof Väli)){
                if (mänguväli.get(hetkmängija.asukoht) instanceof Väli2edasi){
                    Väli2edasi.liiguedasi(hetkmängija);
                    System.out.println(hetkmängija + " läheb 2 ruutu edasi. Ta on nüüd " + hetkmängija.getAsukoht() + ". väljal.");
                }
                else if (mänguväli.get(hetkmängija.asukoht) instanceof Uusveeretus){
                    veeretus = y.vise();
                    System.out.println(hetkmängija + " veeretas uuesti. Sai " + veeretus);
                    hetkmängija.setAsukoht(veeretus);
                    System.out.println("Ta on nüüd " + hetkmängija.getAsukoht() + ". väljal.");
                }
                else if(mänguväli.get(hetkmängija.asukoht) instanceof Väli3tagasi){
                    Väli3tagasi.liigutagasi(hetkmängija);
                    if(hetkmängija.getAsukoht() < 0) { //kontrollib kas mängija läks algusesse
                        hetkmängija.asukoht = 0;
                    }
                    System.out.println(hetkmängija + " läheb 3 ruutu tagasi. Ta on nüüd " + hetkmängija.getAsukoht() + ". väljal.");

                }
                if(hetkmängija.getAsukoht() >= mänguväli.size()){ //kontrollib kas mängija võitis
                    System.out.println("Võitis " + hetkmängija + "!");
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
