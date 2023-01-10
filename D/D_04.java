package D;

import java.util.Scanner;

public class D_04 {
    void d04(){
        Scanner scanner = new Scanner(System.in);
// 가족의 인원 수를 입력받음
        System.out.print("Enter number of family members >");
        int familySize = scanner.nextInt();

        int minorCount = 0; // 미성년자 인원 수

        for (int i = 1; i <= familySize; i++) {
            // 각 가족의 태어난 년도를 입력받음
            System.out.print(" Enter a birth year >");
            int birthYear = scanner.nextInt();

            // 나이 계산
            int age = 2021 - birthYear + 1;

            // 나이가 20세 미만인 경우, 미성년자 인원 수를 증가시킴
            if (age < 20) {
                minorCount++;
            }
        }

// 결과 출력
        System.out.print(" There are "+minorCount+" youngs in the family.");
    }
}
