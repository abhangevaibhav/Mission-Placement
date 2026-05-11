
//87. Program for Diamond star pattern 

public class Question87 {
    public static void main(String args[]) {
        System.out.println("The Diamond pattern is following:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int l = 4; l >= i; l--) {
                System.out.print("**");
            }

            System.out.println();

        }

    }
}
