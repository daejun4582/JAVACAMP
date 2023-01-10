package H;

import java.util.Scanner;

public class H_08 {
    void h08() {
        Scanner s = new Scanner(System.in);
        String input;
        String findStr;
        String replaceStr;
        String[] str;
        int i;


        while(true){
            System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = s.nextLine();

            if(input.charAt(0) == 'x'){
                System.out.println("Exit program");
                break;
            }

            System.out.print("=> Enter a sentence to find > ");
            findStr = s.nextLine();

            System.out.print("=> Enter a sentence to replace > ");
            replaceStr = s.nextLine();

            str = input.split(findStr);

            System.out.printf("=> The replacement occurred %d times\n", str.length-1);

            for(i = 0; i< str.length; i++){
                input = input.replace(findStr, replaceStr);
            }
            System.out.println("=> " + input);
        }
    }
}
