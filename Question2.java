
//2. Even or Odd number 
import java.util.*;

public class Question2 {
    public static void main(String args[]) {
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number = num % 2;
        if (number == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
