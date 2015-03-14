import java.util.Scanner;

/**
 * Created by Madis on 14.03.2015.
 */
public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String enter;
        while(true) {
            enter = sc.nextLine();
            if (enter.equals("")) {
                System.out.println("Vajutasid enterit");
            }
            else if(enter.equals("kill")){
                System.out.println("Tapsid mängu");
                break;
            }
            else{
                System.out.println("Invaliidi input");
            }
        }
    }
}
