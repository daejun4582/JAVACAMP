package D;

import java.util.Scanner;

public class D_02 {
    void d02() {
        Scanner scanner = new Scanner(System.in);

        int min = 100;
        int max = 0;

        while (true) {
            System.out.print("Enter a number > ");
            int num = scanner.nextInt();

            if (num < 0 || num > 100) {
                // Stop the loop if the number is outside the range
                break;
            }

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.print("Max number is " + max);
        System.out.print(", Min number is " + min);
    }
}
