package G;

import java.util.Scanner;

public class G_06 {
    void g06() {
        Scanner s = new Scanner(System.in);

        int[] order = {0,0,0};
        int sale  = 0;
        int tota_sale = 0;
        int[] total_order = {0,0,0};
        int[] price = {10000, 6000, 3000};
        int i;

        System.out.print("There are three type of products\n(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)\n\n");

        while(true){
            System.out.print("How many first products do you want to buy? > ");
            order[0] = s.nextInt();

            System.out.print("How many second products do you want to buy? > ");
            order[1] = s.nextInt();

            System.out.print("How many third products do you want to buy? > ");
            order[2] = s.nextInt();

            if(order[0] == 0 && order[1] == 0 && order[0] == 0){
                break;
            }else{
                sale = order[0]*price[0] + order[1]*price[1] + order[2]*price[2];
                tota_sale += sale;
                System.out.printf("The price is %d\n\n", sale);
            }

        }

        System.out.printf("Total price from now on is %d", tota_sale);
    }
}
