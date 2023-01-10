package F;

import java.util.Scanner;

public class F_04 {
    void f04() {
        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트

        int sum[] = new int[5];

        double average[] = new double[5]; // 3과목 평균 리스트

        int i, j; // 반복문을 위한 변수

        Scanner s = new Scanner(System.in);


        for(i = 0; i<5;  i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ",i+1);
            for(j = 0; j<3; j++){
                jumsu[i][j] = s.nextInt();
            }
        }

        for(i = 0; i<5; i++){
            for(j = 0; j<3; j++){
                sum[i]+= jumsu[i][j];
            }
            average[i] = sum[i]/3.0;
            System.out.printf("Total score of %dth student is %d, average is %.1f\n",i+1,sum[i],average[i]);
        }


    }
}
