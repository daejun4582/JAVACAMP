package C;

import java.util.Scanner;

public class C_01 {
    void c01(){
        int birth_year;
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a birth year > ");
        birth_year = s.nextInt();
        age = 2021- birth_year + 1;
        if(age>=60){
            System.out.print("You are old age");
        }
        else if(age>=30){
            System.out.print("You are middle-age");
        }
        else if(age>=20){
            System.out.print("You are youth");
        }
        else if(age>=13){
            System.out.print("You are teenage");
        }
        else if(age>=7){
            System.out.print("You are child");
        }
        else{
            System.out.print("You are baby");
        }

    }

}
