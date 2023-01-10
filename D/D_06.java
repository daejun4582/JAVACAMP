package D;

import java.util.Scanner;

public class D_06 {
    void d06(){
        Scanner scanner = new Scanner(System.in);
        int smallCount = 0; // 소형 아파트 개수
        int mediumSmallCount = 0; // 중소형 아파트 개수
        int mediumCount = 0; // 중형 아파트 개수
        int largeCount = 0; // 대형 아파트 개수

        for (int i = 1; i <= 10; i++) {
            // 분양 면적 입력
            System.out.print("Enter area of Apartment(m^2) > ");
            double area = scanner.nextDouble();

            // 평형 수 계산
            double pyung = area / 3.305;
            System.out.printf("Area of Apartment(pyung) %.1f\n",pyung);
            // 아파트 종류 판정
            if (pyung < 15) {
                smallCount++;
            } else if (pyung < 30) {
                mediumSmallCount++;
            } else if (pyung < 50) {
                mediumCount++;
            } else {
                largeCount++;
            }
        }

        // 결과 출력
        System.out.println("Count of small-sized apartment is " + smallCount);
        System.out.println("Count of small and medium-sized apartment is " + mediumSmallCount);
        System.out.println("Count of medium-sized apartment is " + mediumCount);
        System.out.println("Count of big-sized apartment is " + largeCount);
    }
}
