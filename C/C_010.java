package C;

import java.util.Scanner;

public class C_010 {
    void c10(){
        int num1,num2;
        int result;
        char c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number1 > ");
        num1 = s.nextInt();
        System.out.print("Enter number2 > ");
        num2 = s.nextInt();
        System.out.print("Enter a math symbol('+', '-', '*', '/') ");
        String operator = s.next();
        c =operator.charAt(0);


        if(c=='+'){
            System.out.printf("Result is %d",num1+num2);
        }
        else if(c=='-'){
            System.out.printf("Result is %d",num1-num2);
        }
        else if(c=='*'){
            System.out.printf("Result is %d",num1*num2);
        }
        else{
            System.out.printf("Result is %d",num1/num2);
        }
    }
}
