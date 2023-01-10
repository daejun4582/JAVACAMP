package K;

import java.util.Scanner;

public class K_01 {
    static int num, price;
    static String name, origin;

    void input() {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number, name, origin, price > ");
        num = s.nextInt();
        name = s.next();
        origin = s.next();
        price = s.nextInt();

    }

    void output(int num, String name, String origin, int price){
        System.out.println("================================================");
        System.out.println("num     name     origin     price");
        System.out.printf("%3d     %s      %s     %d", num, name, origin, price);
    }
}
