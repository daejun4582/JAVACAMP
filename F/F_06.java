package F;

import java.util.Scanner;

public class F_06 {
    void f06(){
        Scanner s = new Scanner(System.in);
        int number[][] = new int[5][3]; // 각 집의 거주자 수, 층별, 호수별 중복 리스트

        int newnum; // 입력받은 숫자

        int total=0; // 아파트의 총 거주자 수

        int ho; // 아파트 호를 나타내는 변수

        int i, j; // 반복문 사용을 위한 변수
        for(i = 0; i<5; i++){
            for (j = 0; j<3; j++){
                System.out.printf("Enter number of people in room %d0%d > ",i+1,j+1);
                number[i][j] = s.nextInt();
                total += number[i][j];
            }
        }

        System.out.printf("Number of people living in this apartment is %d",total);
    }
}
