package I;

import java.util.Scanner;

public class I_05 {
    void i05() {
        int max;
        System.out.println("Find the maximum of 10 numbers");
        max = MaxOfTen();
        System.out.printf("\nMaximum value is %d", max);
    }

    int MaxOfTen(){
        Scanner s = new Scanner(System.in);
        int max, i;
        max=0;
        int newn;
        for(i=0; i<10; i++){
            System.out.printf("Enter %dth number > ", i+1);
            newn = s.nextInt();
            if(newn > max) max = newn;
        }
        return max;
    }
}
