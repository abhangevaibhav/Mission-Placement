
//6. Greatest of two numbers 
import java.util.*;

public class Question6 {
    public static void main(String args[]) {
        System.out.print("Enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Second number");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("first number is greater than second number");
        } else {
            System.out.println("Second number is greater than first number");
        }
        sc.close();
    }
}
