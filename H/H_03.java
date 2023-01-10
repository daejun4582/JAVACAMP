package H;

import java.util.Random;
import java.util.Scanner;

public class H_03 {
    void h03() {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();


        int[] lottoCom = new int[6];
        int[] lottoUser = new int[6];
        int matchCount = 0;

        // Generate random numbers for the computer's lotto numbers
        for (int i = 0; i < 6; i++) {
            lottoCom[i] = rnd.nextInt(45) + 1;

            // Check if the generated number is a duplicate
            for (int j = 0; j < i; j++) {
                if (lottoCom[i] == lottoCom[j]) {
                    // If it is, decrement i so that the current index will be overwritten in the next iteration
                    i--;
                    break;
                }
            }
        }


        for (int i = 0; i < 6; i++) {
            System.out.printf("Enter your %dth lotto number > ",i+1);
            lottoUser[i] = sc.nextInt();

            // Check if the entered number is a duplicate
            for (int j = 0; j < i; j++) {
                if (lottoUser[i] == lottoUser[j]) {
                    System.out.println("Invalid input!");
                    i--;
                    break;
                }
            }
            if(lottoUser[i]>45||lottoUser[i]<=0){
                System.out.println("Invalid input!");
                i--;
                continue;

            }
        }


        // Compare the two sets of lotto numbers and count the number of matches
        System.out.printf("Lotto numbers of this week are ");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ",lottoCom[i]);
            for (int j = 0; j < 6; j++) {
                if (lottoCom[i] == lottoUser[j]) {
                    matchCount++;
                }
            }
        }
        System.out.println();
        System.out.printf("There are %d matching lotto numbers" , matchCount);
    }
}
