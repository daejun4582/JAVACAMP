package H;

import java.util.Random;
import java.util.Scanner;

public class H_04 {
    void h04() {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        String onemore;
        int i;
        int lotto[] = new int[6];

        while(true){
            System.out.print("The generated lotto numbers are ");
            for(i = 0; i< 6; i++){
                lotto[i] = random.nextInt(45) + 1;
                System.out.print(lotto[i] + " ");
            }
            System.out.print("\n");

            System.out.print("Do you want to generate more lotto numbers? (Y/N) > ");
            onemore = s.next();

            if(onemore.charAt(0) == 'N')
                break;
        }
    }
}
