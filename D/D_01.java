package D;

import java.util.Scanner;

public class D_01 {
    void d01(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("Invalid input");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum of all integer from 1 to the number entered is " + sum);
        }
    }
}
