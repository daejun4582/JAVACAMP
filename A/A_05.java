package A;

import java.util.Scanner;

public class A_05 {
    void a05(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days > ");
        int days = s.nextInt();
        int seconds = days*24*3600;
        System.out.println("Total seconds is "+seconds);
    }
}
