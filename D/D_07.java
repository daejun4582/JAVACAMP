package D;

import java.util.Scanner;

public class D_07 {
    void d07(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Enter the start and end values of x coordinates > ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        // x의 시작 값부터 마지막 값까지 0.1씩 증가하며 y 값 계산 및 출력
        for (int x = x1; x <= x2; x ++) {
            int y = a * x + b;
            System.out.printf("coordinates (%d, %d)\n", x, y);
        }
    }
}
