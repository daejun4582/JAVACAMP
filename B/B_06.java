package B;

import java.util.Scanner;

public class B_06 {
    void b06(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter points of Korean > ");
        int kor = s.nextInt();
        System.out.print("Enter points of English > ");
        int eng = s.nextInt();
        System.out.print("Enter points of Math > ");
        int math = s.nextInt();
        int total = math+eng+kor;
        double average = (total/3.0);
        System.out.println("Total point is "+total);
        System.out.printf("The average is %.1f\n",average);

        if(kor>=90){
            System.out.print("Korean grade is outstanding!\n");
        }
        if(eng>=90){
            System.out.print("English grade is outstanding!\n");

        }
        if(math>=90){
            System.out.print("Math grade is outstanding!\n");

        }
    }
}
