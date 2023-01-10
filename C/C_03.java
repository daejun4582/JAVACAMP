package C;

import java.util.Scanner;

public class C_03 {
    void c03() {
        int width, height; // 가로크기, 세로크기

        Scanner s = new Scanner(System.in);


        System.out.print("Enter width of Rectangle > ");
        width = s.nextInt();
        System.out.print("Enter height of Rectangle > ");
        height = s.nextInt();



        if(width == height){
            System.out.print("It is square");
        }
        else if(width <height){

            if(height >= 2*width){

                System.out.print("It is an oblong rectangle from top to bottom.");
            }
            else
                System.out.print("It is a vertical rectangle.");
        }


        else if(width >height){

            if(width >= 2*height){

                System.out.print("It is an oblong rectangle from side to side.");
            }
            else
                System.out.print("It is a horizontal rectangle.");

        }

    }
}
