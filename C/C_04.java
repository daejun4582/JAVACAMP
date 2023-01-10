package C;

import java.util.Scanner;

public class C_04 {
    void c04(){
        Scanner s = new Scanner(System.in);
        double m2_area;
        double pyung_area;

        System.out.print("Enter area of Apartment(m^2) > ");
        m2_area = s.nextDouble();
        pyung_area = m2_area/3.305;
        String area = String.format("%.1f", pyung_area);
        System.out.println("Area of Apartment(pyung) "+area);

        if(pyung_area>=50){
            System.out.print("It is big-sized apartment");
        }
        else if(pyung_area>=30){
            System.out.print("It is medium-sized apartment");
        }
        else if(pyung_area>=15){
            System.out.print("It is small and medium-sized apartment");
        }
        else{
            System.out.print("It is small-sized apartment");
        }

    }
}
