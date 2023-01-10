package H;

import java.util.Random;
import java.util.Scanner;

public class H_05 {
    void h05() {
        int coins; // 사용자의 코인 수. (최초에 입력받음)

        int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트

        int dummy; // 게임스타트를 위한 의미 없는 입력 숫자

        int i; // 반복문을 위한 변수

        int count=1;
        int max=-1;

        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Enter number of coins > ");
        coins = s.nextInt();
        i=0;
        while(true){
            coins--;
            System.out.printf("Start %dth game!!! (Enter any number) > ",i+1);
            dummy = s.nextInt();
            System.out.print("Result of game : ");
            for(i = 0; i<3; i++){
                number[i] = rnd.nextInt(9) + 1;
                System.out.printf("%d ",number[i]);
            }
            max=-1;
            for(i = 0; i<3; i++){
                count= 1;
                for(int j = i+1; j<3; j++){
                    if(number[i]==number[j]) count++;
                }
                if(max<count) max = count;
            }

            if(max==3){
                System.out.println("---> match 3 numbers! got four more coins");
                coins+=4;
            }
            else if(max==2){
                System.out.println("---> match 2 numbers! got two more coins");
                coins+=2;
            }
            else{
                System.out.println("---> Failed...");
            }
            System.out.printf("There are %d coins remaining.\n",coins);
            if(coins==0){
                System.out.println();
                System.out.println("Game over!");
                break;
            }
        }
    }
}
