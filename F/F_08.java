package F;

import java.util.Scanner;

public class F_08 {
    void f08() {
        int number[] = new int[10];// 사용자가 입력한 숫자 10개

        int newnum; // 입력받은 숫자

        int count=0; // 현재까지 입력된 숫자의 개수(0~10)

        boolean dup; // 중복검사 통과 여부 (true : 중복, false : 중복없음)

        int i; // 반복문을 위한 변수

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100");
        for(i=0; i<10; i++){
            dup = true;
            System.out.printf("Enter %dth number > ",i+1);
            newnum = s.nextInt();
            for(int j = 0; j<count; j++){
                if(newnum == number[j]){
                    dup = false;
                    break;
                }
            }
            if(dup==false){i--;System.out.println("Invalid input!");}
            else{number[i] = newnum;count++;}
        }


        for(i=0; i<10; i++){
            System.out.printf("%dth number is %d\n",i+1,number[i]);
        }
    }
}
