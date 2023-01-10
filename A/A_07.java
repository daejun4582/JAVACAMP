package A;

import java.util.Scanner;

public class A_07 {
    void a07(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file size as gigabytes > ");
        int gigabytes = s.nextInt();
        int megabytes = gigabytes*1024;
        int kilobytes = megabytes *1024;
        long bytes = (long)kilobytes*1024;
        System.out.print("Your file size is\n");
        System.out.println(megabytes+" MB");
        System.out.println(kilobytes +" KB");
        System.out.println(bytes +" B");

    }
}
