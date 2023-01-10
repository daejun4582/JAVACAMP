package I;

import java.util.Scanner;

public class I_01 {
    void i01() {
        Scanner s = new Scanner(System.in);
        int []price = {15000,10000,7000,2000};
        int menu,sum=0;
        while(true){
            ShowMenu();
            menu = s.nextInt();
            if(menu==5) break;
            sum+=price[menu-1];
            System.out.println("Order price from now on is "+sum);
            System.out.println();
        }
        System.out.println("Total price is "+sum);
    }

    void ShowMenu(){
        System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
    }
}
