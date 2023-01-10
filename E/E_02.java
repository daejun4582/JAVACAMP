package E;

import java.util.Scanner;

public class E_02 {
    void e02(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a height of right triangle and black > ");
        int height = input.nextInt();
        int margin = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < margin; j++) {
                System.out.print(" ");
            }
            for (int j = height-i-1; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
