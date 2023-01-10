package I;

import java.util.Scanner;

public class I_07 {
    Scanner s = new Scanner(System.in);

    void i07() {
        String c;
        int menu,sum=0,i=1;
        while(true){
            ShowMenu();
            menu = SelectCan();
            sum+=menu;
            System.out.print("Do you need more menu? (Y/N) > ");
            c = s.next();
            if(c.equals("N")) break;
            i++;
            System.out.println();
        }

        System.out.print("Total price for " +i +" drinks is "+ sum);
    }

    int SelectCan(){
        int []price = {700,300,1000,500,-1};
        System.out.print("Please select menu > ");
        int menu;
        menu = s.nextInt();
        return price[menu-1];
    }
    void ShowMenu(){
        System.out.println("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)");
    }
}
