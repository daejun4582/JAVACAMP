package I;

import java.util.Scanner;

public class I_04 {
    Scanner s = new Scanner(System.in);
    void i04() {

        int menu,sum=0;
        while(true){
            ShowMenu();
            menu = SelectMenu();
            if(menu==-1) break;
            sum+=menu;
            System.out.println("Order price from now on is "+sum);
            System.out.println();
        }
        System.out.println("Total price is "+sum);

    }

    int SelectMenu() {
        int []price = {15000,10000,7000,2000,-1};
        int menu = s.nextInt();
        return price[menu-1];
    }
    void ShowMenu(){

        System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
    }
}
