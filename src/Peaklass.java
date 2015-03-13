
public class Peaklass {
    public static void main(String[] args) {
        Nupp Hetkmängja = new Nupp("Karl");
        for (int i = 0; i < 10; i++) {
            Täring y = new Täring();
            System.out.println(y.täringuvise);
            y = null; //kaotab objekti, vist pole vaja, aga hea teada hiljemaks
        }
    }
}
