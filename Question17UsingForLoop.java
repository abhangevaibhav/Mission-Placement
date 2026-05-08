
//17. Factorial of a number(by using for loop)
import java.util.*;

public class Question17UsingForLoop {
    public static void main(String args[]) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Factorial = 1;
        for (int i = num; i >= 1; i--) {
            Factorial = i * Factorial;
        }
        sc.close();
        System.out.println("The Factorial of number is : " + Factorial);
    }
}
