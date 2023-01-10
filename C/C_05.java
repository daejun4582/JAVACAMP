package C;

import java.util.Scanner;

public class C_05 {
    void c05(){
        Scanner s = new Scanner(System.in);
        int month,day;
        int day_count;
        int sum = 0;
        int check=0;
        System.out.print("Enter a month > ");
        month = s.nextInt();
        System.out.print("Enter a day > ");
        day = s.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day>31){
                System.out.print("This date is not valid.");
                check = 1;
            }
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day>30){
                System.out.print("This date is not valid.");
                check = 1;
            }
        }
        else{
            if(day>28){
                System.out.print("This date is not valid.");
                check = 1;
            }
        }


        if(check==0){

            for(int i =1; i<month; i++){
                if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12){
                    day_count = 31;
                }
                else if(i == 4 || i == 6 || i == 9 || i == 11){
                    day_count=30;
                }
                else{
                    day_count=28;
                }
                sum = sum+day_count;
            }
            sum+=day;
            System.out.println("This date is "+sum+"th of the year");

        }

    }

}
