package H;

import java.util.Random;
import java.util.Scanner;

public class H_01 {
    void h01() {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int answer;
        int number_try;
        int count = 0;

        answer = random.nextInt(100) + 1;

        while(true){
            System.out.print("Guess the number from 1 to 100 > ");
            number_try = s.nextInt();

            if(number_try > answer){
                System.out.print("Down!\n");
            }
            else if(number_try < answer){
                System.out.print("Up!\n");
            }
            else{
                break;
            }
            count++;
        }

        System.out.printf("You figured out the number in %d times", count);


    }
}
