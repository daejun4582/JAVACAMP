package A;
import java.util.Scanner;

public class A_01 {
    void a01() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a birth year > ");
        int birthyear = s.nextInt();
        int age = 2022 - birthyear + 1;


        System.out.println("You are " + age + " years old.");

    }
}