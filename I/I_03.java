package I;

import java.util.Scanner;

public class I_03 {
    Scanner s = new Scanner(System.in);
    void i03() {

        int height;
        int weight;

        for(int i = 0; i< 10; i++){
            System.out.print("Enter height(cm) and weight > ");
            height = s.nextInt();
            weight = s.nextInt();
            AskBiman(height, weight);
        }


    }

    void AskBiman(int height, int weight){

        double bmi = weight / (height *0.01 * height * 0.01);

        if(bmi < 18.5){
            System.out.println("You are low weight");
        }
        else if(bmi < 23){
            System.out.println("You are normal weight");
        }
        else if(bmi < 25){
            System.out.println("You are obesity");
        }
        else if(bmi < 30){
            System.out.println("You are obesity");
        }
        else{
            System.out.println("You are high obesity");
        }
        System.out.println();

    }
}
