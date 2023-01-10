package C;

import java.util.Scanner;

public class C_09 {
    void c09(){
        int income;
        int tax;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your income > ");
        income = s.nextInt();

        if(income>80000000){
            System.out.printf("Income tax on salary is %.0f",income*0.37);
        }
        else if(income>40000000){
            System.out.printf("Income tax on salary is %.0f",income*0.28);
        }
        else if(income>10000000){
            System.out.printf("Income tax on salary is %.0f",income*0.19);
        }
        else{
            System.out.printf("Income tax on salary is %.0f",income*0.095);
        }

    }
}
