package H;

import java.util.Scanner;

public class H_07 {
    void h07() {
        String input; // 입력받는 문자열
        String[] array_word;
        int i; // 반복문에 사용되는 변수
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("===============================");
            System.out.println();
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = s.nextLine();
            array_word = input.split("");
            if(input.equals("x")) break;
            System.out.printf("=> Number of character is %d\n",input.length());
            for(i=0; i<input.length(); i++){
                System.out.println("=> "+array_word[i]);
            }

        }
        System.out.print("Exit program");
    }
}
