package F;

import java.util.Scanner;

public class F_02 {
    void f02() {
        Scanner scanner = new Scanner(System.in);
        // 심사점수를 저장할 리스트
        double score[] = new double[10]; // 심사점

        // 심사점수를 10개 입력받음
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter %dth score > ",i+1);
            score[i] = scanner.nextDouble();
        }

        // 가장 큰 점수와 가장 작은 점수를 찾음
        double minScore = score[0];
        double maxScore = score[0];
        for (int i = 0; i<10; i++) {
            if (score[i] < minScore) {
                minScore = score[i];
            }
            if (score[i] > maxScore) {
                maxScore = score[i];
            }
        }

        // 가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수의 합계를 계산
        double sum = 0;
        for (int i = 0; i<10; i++) {
            if (score[i] != minScore && score[i] != maxScore) {
                sum += score[i];
            }
        }

        // 8개의 점수에 대한 평균을 계산하여 출력
        double avg =  sum / 8.0;
        System.out.printf("Average is %.1f",avg);

    }
}
