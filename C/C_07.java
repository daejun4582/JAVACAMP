package C;

import java.util.Scanner;

public class C_07 {
    void c07(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file size as megabytes > ");
        int megabytes = s.nextInt();
        System.out.print("Enter transfer method (1. WiFi, 2. Bluetooth, 3. LTE, 4. USB) > ");
        int c = s.nextInt();
        double time;
        long bytes = megabytes*1024*1024;

        if (c==1){
            time = bytes /  1500000.0;
        }
        else if(c==2){
            time =  bytes /  300000.0;
        }
        else if(c==3){
            time = bytes /  1000000.0;
        }
        else{
            time = bytes /  60000000.0;

        }

        System.out.printf("File transfer time is %.1f",time);
    }
}
