//5. Sum of numbers in a given range  

import java.util.*;

public class Question5 {
    public static void main(String args[]) {
        System.out.println("To find sum of numbers in a range of n to N  ");
        System.out.println(" Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers in a range of n to N is : " + sum);

    }
}
