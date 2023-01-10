package E;

import java.util.Scanner;

public class E_05 {
    void e05(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
        int mode = input.nextInt();
        System.out.print("Enter a numbers of column > ");
        int column = input.nextInt();

        if (mode == 1) {
            for (int i = 3; i <= 9; i += 2) {
                for (int k = 1; k <= 9; k++) {
                    System.out.printf("%d X %d = %d", i, k, i * k);
                    if(k%column==0) System.out.println();
                    else System.out.printf("\t");
                }

                System.out.println();
            }
        } else if (mode == 2) {
            for (int i = 2; i <= 8; i += 2) {
                for (int k = 1; k <= 9; k++) {
                    System.out.printf("%d X %d = %d", i, k, i * k);
                    if(k%column==0) System.out.println();
                    else System.out.printf("\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
