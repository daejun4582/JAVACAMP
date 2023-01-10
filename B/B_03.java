package B;

import java.util.Scanner;

public class B_03 {
    void b03(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter width of Rectangle > ");
        int width = s.nextInt();
        System.out.print("Enter height of Rectangle > \n");
        int height = s.nextInt();
        int area = height * width;
        System.out.println("Area of Rectangle is "+area+" and");
        if(height == width){
            System.out.print("it is square");
        }
        else{
            System.out.print("it is not square");
        }

    }

}
