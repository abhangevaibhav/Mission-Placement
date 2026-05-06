
//1. Positive or Negative number
import java.util.*;

public class Question1 {
    public static void main(String args[]) {
        System.out.print("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("The number you entered is Negative");
        } else if (num > 0) {
            System.out.println("The number you entered is positive");
        } else {
            System.out.println("The number you enterd is neither positive nor negative ");
        }
        sc.close();
    }
}