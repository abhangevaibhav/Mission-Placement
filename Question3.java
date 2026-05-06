
//3. Sum of First N Natural numbers
import java.util.*;

public class Question3 {
    public static void main(String args[]) {
        System.out.print("Enter Natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = 0;
        for (int i = 1; i <= n; i++) {
            N += i;
        }
        System.out.print("The sum of first N Natural number is : " + N);
        sc.close();
    }
}