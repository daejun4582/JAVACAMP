package B;

import java.util.Scanner;

public class B_09 {
    void b09(){
        Scanner s =new Scanner(System.in);
        System.out.print("Enter height(cm) ");
        int height = s.nextInt();
        System.out.print("Enter weight(kg) ");
        int weight = s.nextInt();

        int bmi = (int)(10000*weight) /(height*height) ;

        if (bmi>=25){
            System.out.print("You are obesity");
        }
        else{
            System.out.print("You are not obesity");
        }

    }
}
