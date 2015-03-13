import java.util.Random;

public class Täring {
     Random random = new Random();
     public int vise(){ //meetod viske jaoks
          int tulemus = random.nextInt(6) + 1;
          return tulemus;
     }
}
