package D;

import java.util.Scanner;

public class D_08 {
    void d08(){
        Scanner scanner = new Scanner(System.in);
        // 계수 a 입력
        System.out.print("Enter the coefficients a and b of quadratic function(y=ax^2+bx+c) > ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.print("Enter the start and end values of x coordinates > ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        for (int x = x1; x <= x2; x++) {
            int y = a * x * x + b * x + c;
            System.out.printf("coordinates (%d, %d)\n",x,y);
        }
    }
}
