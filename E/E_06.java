package E;

import java.util.Scanner;

public class E_06 {
    void e06(){
        Scanner scanner = new Scanner(System.in);

        // 입력받은 행과 열의 크기를 저장할 변수
        int rows, columns;

        // 행과 열의 크기를 입력받음
        System.out.print("Enter a rows and columns > ");
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        // 각 칸의 행 번호와 열 번호의 곱을 출력
        for (int i = 1; i <= columns; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.printf("%3d ",i * j );
            }
            System.out.println();
        }
    }
}
