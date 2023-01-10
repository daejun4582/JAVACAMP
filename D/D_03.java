package D;

import java.util.Scanner;

public class D_03 {
    void d03(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter a number from 0 to 100 > ");
            int num = scanner.nextInt();

            if (num < 0 || num > 100) {
                // Stop the loop if the number is outside the range
                break;
            }

            count++;
            sum += num;
        }

        double average = (double) sum / count;


        System.out.print("The sum of "+count+" numbers is " + sum);
        System.out.print(", average is " + average);
    }
}
