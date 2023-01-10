package C;

import java.util.Scanner;

public class C_08 {
    void c08(){
        int num1, num2, num3; // 첫 번째 숫자, 두 번째 숫자, 세 번째 숫자


        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number > ");
        num1 = s.nextInt();
        System.out.print("Enter second number > ");
        num2 = s.nextInt();
        System.out.print("Enter third number > ");
        num3 = s.nextInt();

        int max_num = num1;
        int  min_num = num2;

        if(num1>num2 && num1>num3){
            max_num = num1;
        }
        else if(num2>num1 && num2>num3){
            max_num = num2;
        }
        else if(num3>num1 && num3>num2){
            max_num = num3;
        }

        if(num1<num2 && num1<num3){
            min_num = num1;
        }
        else if(num2<num1 && num2<num3){
            min_num = num2;
        }
        else if(num3<num1 && num3<num2){
            min_num = num3;
        }

        System.out.printf("Max number is %d, Min number is %d",max_num,min_num);


    }
}
