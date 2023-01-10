package B;

import java.util.Scanner;

public class B_02 {
    void b02(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature > ");
        double input_degree = s.nextDouble();
        System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
        String kind = s.next();
        char c = kind.charAt(0);
        double output_degree;
        if(c =='C'){
            output_degree = input_degree*1.8 +32;
            System.out.println("Fahrenheit temperature is "+output_degree);

        }
        else{
            output_degree = (input_degree-32)/1.8;
            System.out.println("Celsius temperature is "+output_degree);
        }
    }
}
