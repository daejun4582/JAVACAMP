package C;

import java.util.Scanner;

public class C_02 {
    void c02(){
        double input_degree;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter water temperature > ");
        input_degree = s.nextDouble();

        if(input_degree>= 80){
            System.out.print("It's boiling water");
        }
        else if(input_degree>=40){
            System.out.print("It's hot water");
        }
        else if(input_degree>=25){
            System.out.print("It's warm water");
        }
        else if(input_degree>=0){
            System.out.print("It's cold water");
        }
        else{
            System.out.print("Invalid input!");
        }

    }
}
