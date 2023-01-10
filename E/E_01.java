package E;

import java.util.Scanner;

public class E_01 {
    void e01(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a length of rectangle > ");
        int size = input.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
