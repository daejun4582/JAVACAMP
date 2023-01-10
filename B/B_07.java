package B;

import java.util.Scanner;

public class B_07 {
    void b07(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file size as megabytes > ");
        int megabytes = s.nextInt();
        System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
        String usb2  = s.next();
        char c = usb2.charAt(0);
        int time;
        long bytes = megabytes*1024*1024;

        if (c=='Y'){
            time =(int) bytes /  60000000;
        }
        else{
            time =(int) bytes /  1500000;
        }
        System.out.print("File transfer time is "+ time);

    }
}
