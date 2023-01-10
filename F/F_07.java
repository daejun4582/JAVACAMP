package F;

import java.util.Scanner;

public class F_07 {
    void f07() {
        Scanner s = new Scanner(System.in);
        int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트

        int floor_total[] = new int[5]; // 층별 거주자 합계 리스트 (1층, 2층, 3층, 4층, 5층)

        int line_total[] = new int[3]; // 호수별 거주자 합계 리스트 (1호라인, 2호라인, 3호라인)

        int newnum; // 입력받은 숫자

        int total=0; // 아파트의 총 거주자 수

        int ho; // 아파트 호를 나타내는 변수

        int i, j; // 반복문 사용을 위한 변수

        for(i = 0; i<5; i++){

            for (j = 0; j<3; j++){
                System.out.printf("Enter number of people in room %d0%d > ",i+1,j+1);
                number[i][j] = s.nextInt();
                total += number[i][j];
                line_total[j]+=number[i][j];
                floor_total[i] += number[i][j];
            }
        }



        for(i=0; i<5; i++){
            System.out.printf("Number of people living in %d floor is %d\n",i+1,floor_total[i]);
        }
        System.out.println();
        for(j=0; j<3; j++){
            System.out.printf("Number of people living in %d line is %d\n",j+1,line_total[j]);
        }
        System.out.println();
        System.out.printf("Number of people living in this apartment is %d\n",total);
    }
}
