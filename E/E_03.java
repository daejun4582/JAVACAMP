package E;

import java.util.Scanner;

public class E_03 {
    void e03(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height of triangle > ");
        int height = input.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
