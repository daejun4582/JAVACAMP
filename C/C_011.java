package C;

import java.util.Scanner;

public class C_011 {
    void c11(){
        int year;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year > ");
        year = s.nextInt();

        if(year%4==0){
            if(year%100 ==0){
                if(year%400 ==0){
                    System.out.print("This year is leap year");
                }
                else{
                    System.out.print("This year is not leap year");
                }
            }
            else{
                System.out.print("This year is leap year");
            }

        }
        else{
            System.out.print("This year is not leap year");
        }

    }
}
