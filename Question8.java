
//8. Leap year or not  
import java.util.*;

public class Question8 {
    public static void main(String args[]) {
        System.out.println("Enter year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0) {
            System.out.print("The year you entered is leap year");
        } else {
            System.out.println("The year you entered is not leap year");
        }
        sc.close();
    }
}
