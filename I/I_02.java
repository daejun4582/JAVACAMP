package I;

import java.util.Scanner;

public class I_02 {
    void i02() {
        Scanner s = new Scanner(System.in);
        char c;
        int height, blank;
        System.out.print("Enter a character to draw triangle > ");
        c = s.next().charAt(0);
        System.out.print("Enter a height of right triangle and blank > ");
        height = s.nextInt();
        blank = s.nextInt();
        PrintCharWithBlank(blank, height, c);
    }

    void PrintCharWithBlank(int blanks, int size, char ch){
        int i, j;
        for(i=0; i<size; i++){
            for(j=0; j<(blanks+size)-i-1; j++){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
