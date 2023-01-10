package G;

import java.util.Scanner;

public class G_07 {
    void g07() {
        int team_count; // 방문한 팀수
        int[] charge = {5000, 10000, 15000, 3000};// 연령별 수
        int[] count = new int[4]; // 입력받은 연령별 인원 수
        int[] v_count = new int[4]; // 연령별 방문자 합계
        int total_count = 0; // 총 방문자 수
        int sum; // 팀별 계산한 요금
        int total_sum =0; // 총 요금
        int membership = 0; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of team >");
        team_count = s.nextInt();
        System.out.println();
        for(int i = 0; i<team_count; i++){
            sum = 0;
            System.out.printf("Enter a number of %d th team member (child, youth, adult, old) > ",i+1);
            for(int j = 0; j<4; j++){
                count[j]= s.nextInt();
                sum = sum + count[j]*charge[j];
                v_count[j] += count[j];
                total_count+=count[j];
            }
            System.out.printf("Enter a discount membership type of %d th team (no membership:0 , normal:1 , VIP:2) > ",i+1);
            membership = s.nextInt();

            if(membership ==1) sum*=0.9;
            else if(membership ==2) sum*=0.8;
            total_sum+=sum;
            System.out.printf("Admission fees of %dth team is %d\n\n",i+1,sum);
        }

        System.out.printf("Total number of visitors %d\n",total_count);
        System.out.printf("Total number of child %d\n",v_count[0]);
        System.out.printf("Total number of youth %d\n",v_count[1]);
        System.out.printf("Total number of adult %d\n",v_count[2]);
        System.out.printf("Total number of old %d\n",v_count[3]);
        System.out.printf("\nTotal free is %d",total_sum);
    }
}
