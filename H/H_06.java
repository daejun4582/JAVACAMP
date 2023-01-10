package H;

import java.util.Scanner;

public class H_06 {
    void h06() {
        Scanner s = new Scanner(System.in);
        int number[] = new int[5];
        int pow_value[][] = new int[5][5];
        int max, min;
        int max_a, max_b;
        int min_a, min_b;
        int i, j;

        System.out.print("Enter 5 numbers from 2 to 9 > ");
        for(i = 0; i<5; i++){
            number[i] = s.nextInt();
        }

        for(i = 0; i<5; i++){
            for(j = 0; j<5; j++){
                if(i == j)
                    continue;
                pow_value[i][j] = (int) Math.pow(number[i], number[j]);
            }
        }

        max = min = pow_value[0][1];
        max_a = number[0];
        max_b = number[1];
        min_a = number[1];
        min_b = number[0];

        for(i = 0; i<5; i++){
            for(j = 0; j<5; j++){

                if(i == j)
                    continue;

                if(max < pow_value[i][j]){
                    max = pow_value[i][j];
                    max_a = number[j];
                    max_b = number[i];
                }

                if(min > pow_value[i][j]){
                    min = pow_value[i][j];
                    min_a = number[j];
                    min_b = number[i];
                }
            }
        }

        System.out.printf("Max number is %d which is %d squared of %d\n", max, max_a, max_b);
        System.out.printf("Min number is %d which is %d squared of %d\n", min, min_a, min_b);
    }
}
