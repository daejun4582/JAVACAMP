package H;

import java.util.Scanner;

public class H_09 {
    void h09() {
        String input; // 입력받는 문자열
        String[] array_word;
        String[] array_word1;
        int i; // 반복문에 사용되는 변수
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("=============================");
            System.out.println();
            System.out.print("Enter string ('x' for exit) > ");
            input = s.nextLine();
            array_word = input.split("###");
            if(input.equals("x")) break;
            System.out.printf("Total number of people is %d\n",array_word.length);
            for(i=0; i<array_word.length; i++){
                input = array_word[i];
                array_word1 =input.split("\\|");
                System.out.printf("%d ",i+1);
                for(int j=0; j<2; j++){
                    System.out.print(array_word1[j]+" ");
                }
                if(i!=array_word.length-1) System.out.println();
            }
            System.out.println();
        }


        // System.out.println();
        System.out.print("Exit program");
    }
}
