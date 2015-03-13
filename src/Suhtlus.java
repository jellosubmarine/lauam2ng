import java.util.ArrayList;
import java.util.Scanner;

public class Suhtlus {
    public static void main(String[] args) {
        ArrayList<Nupp> mängijad = new ArrayList<Nupp>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta mängijate arv");
        int limiit = sc.nextInt();
        int i = 0;

        while(i < limiit) {
            System.out.println("Sisesta mängija nimi");
            String nimi = sc.next();
            mängijad.add(new Nupp(nimi));
            i++;


        }
        System.out.println(mängijad);
    }
}
