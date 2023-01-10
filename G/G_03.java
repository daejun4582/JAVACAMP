package G;

import java.util.Scanner;

public class G_03 {
    void g03() {
        int jumsu[][] = new int[5][3]; // 5명의 3과목 점수를 저장하고 있는 중복 리스트

        int sum[] = new int[5];
        int csum[] = new int[3];

        double average[] = new double[5]; // 3과목 평균 리스트
        double caverage[] = new double[3];
        int i, j; // 반복문을 위한 변수
        char c;

        Scanner s = new Scanner(System.in);


        for(i = 0; i<5;  i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ",i+1);
            for(j = 0; j<3; j++){
                jumsu[i][j] = s.nextInt();
            }
        }

        for(i = 0; i<3;  i++){
            for(j = 0; j<5; j++){
                csum[i] += jumsu[j][i];
            }
            caverage[i] = csum[i]/5.0;
        }
        System.out.println();
        System.out.println("1) Total score and average for each subjects");
        System.out.printf("Total Korean score is %d, average is %.1f\n",csum[0],caverage[0]);
        System.out.printf("Total English score is %d, average is %.1f\n",csum[1],caverage[1]);
        System.out.printf("Total Math score is %d, average is %.1f\n",csum[2],caverage[2]);
        System.out.println();
        System.out.println("2) Total score and average for each students");

        for(i = 0; i<5; i++){
            for(j = 0; j<3; j++){
                sum[i]+= jumsu[i][j];
            }
            average[i] = sum[i]/3.0;
            if(average[i]>=90){c = 'A';}
            else if(average[i]>=80){c = 'B';}
            else if(average[i]>=70){c = 'C';}
            else if(average[i]>=60){c = 'D';}
            else {c = 'F';}
            System.out.printf("%dth student score: Total - %d, average - %.1f, grade - %c\n",i+1,sum[i],average[i],c);
        }

    }
}
