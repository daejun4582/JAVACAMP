package B;

import java.util.Scanner;

public class B_05 {
    void b05(){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days > ");
        int days = s.nextInt();
        int seconds = days*24*3600;
        System.out.println("Total seconds is "+seconds);
        System.out.println(String.format("It includes million seconds %d times", seconds/1000000));
    }
}
