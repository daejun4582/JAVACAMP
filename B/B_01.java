package B;

import java.util.Scanner;

public class B_01 {
    void b01(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a birth year > ");
        int birth_year = s.nextInt();
        int age = 2021-birth_year +1;
        if(age<20){
            System.out.print("You are not adult");
        }
        else{
            System.out.print("You are adult");
        }
    }
}
