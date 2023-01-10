package F;

import java.util.Scanner;

public class F_01 {
    void f01() {
        Scanner s = new Scanner(System.in);
        int[] num = new int[10];
        int first=0; // 첫 번째로 큰 수
        int second=0; // 두 번째로 큰 수
        int second_max_index=0; // 두 번째로 큰 수의 인덱스
        int newnum; // 숫자 입력을 위한 변수

        for(int i = 0; i<10; i++){
            System.out.printf("Enter %dth number > ",i+1);
            num[i] = s.nextInt();
        }
        for(int i = 0; i<10; i++){
            if(num[i]>first){
                first = num[i];
            }
        }
        for(int i = 0; i<10; i++){
            if(num[i]>second && num[i]<first){
                second = num[i];
                second_max_index = i;
            }
        }
        System.out.printf("Second largest number is %dth number %d",second_max_index+1,second);
    }

}
