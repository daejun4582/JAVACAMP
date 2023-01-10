package F;

import java.util.Scanner;

public class F_05 {
    void f05() {
        int height, weight; // 입력받은 신장(cm), 체중(kg)

        float bmi; // 계산된 비만도 수치

        float bmilist[][] = new float[10][3]; // 10명에 대한 신장, 체중, 비만도수치를 담고 있는 리스트

        int count=0; // 비만인 사람의 숫자

        int i; // 반복문을 위한 변수

        Scanner s = new Scanner(System.in);

        for(i = 0; i<10; i++){
            System.out.printf("Enter height(cm) and weight(kg) ");
            for(int j = 0; j<2; j++){
                bmilist[i][j] = s.nextFloat();
            }
            bmilist[i][0] = bmilist[i][0]/100;
            bmilist[i][2] = bmilist[i][1]/(bmilist[i][0]*bmilist[i][0]);

            if(bmilist[i][2]>=25) count++;
        }

        for(i=0; i<10; i++){
            if(bmilist[i][2]>=25) System.out.printf("%dth person is obesity\n",i+1);
        }
        System.out.printf("%d people is obesity\n",count);

    }
}
