package D;

import java.util.Scanner;

public class D_010 {
    void d10(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers > ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        // 1부터 100까지의 숫자 중 첫번째 숫자 또는 두번째 숫자의 배수 출력
        for (int i = 1; i <= 100; i++) {
            if ((i % number1 == 0 || i % number2 == 0) && !(i % number1 == 0 && i % number2 == 0)) {
                System.out.printf("%d ",i);
            }
        }
    }
}
