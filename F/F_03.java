package F;

import java.util.Scanner;

public class F_03 {
    void f03() {
        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트

        int sum[] = new int[3]; // 3과목 총점 리스트

        double average[] = new double[3]; // 3과목 평균 리스트

        int i, j; // 반복문을 위한 변수

        Scanner s = new Scanner(System.in);


        for(i = 0; i<5;  i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ",i+1);
            for(j = 0; j<3; j++){
                jumsu[i][j] = s.nextInt();
            }
        }

        for(i = 0; i<3;  i++){
            for(j = 0; j<5; j++){
                sum[i] += jumsu[j][i];
            }
            average[i] = sum[i]/5.0;
        }

        System.out.printf("Total Korean score is %d, average is %.1f\n",sum[0],average[0]);
        System.out.printf("Total English score is %d, average is %.1f\n",sum[1],average[1]);
        System.out.printf("Total Math score is %d, average is %.1f\n",sum[2],average[2]);
    }
}
