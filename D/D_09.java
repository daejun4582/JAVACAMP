package D;

import java.util.Scanner;

public class D_09 {
    void d09(){
        Scanner scanner = new Scanner(System.in);
        // 입력받은 숫자
        int number;

        // 입력받은 숫자가 2부터 9 사이의 숫자가 아닌 경우 반복
        do {
            // 숫자 입력
            System.out.print("Enter number of gugudan(2~9) > ");
            number = scanner.nextInt();

            if (number < 2 || number > 9) {
                // 잘못된 입력
                System.out.println("Invalid input");
            }
        } while (number < 2 || number > 9);

        // 구구단 출력
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }
    }
}
