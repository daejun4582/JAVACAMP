package G;

import java.util.Scanner;

public class G_04 {
    void g04() {
        int kind;
        int money;
        int charge;
        int total_charge = 0;
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > ");
            kind = s.nextInt();
            if(kind == 0)
                break;
            System.out.print("Enter the amount of real estate transaction. > ");
            money = s.nextInt();


            if(kind == 1){
                if(money < 50000000){
                    charge = money / 1000 * 6;
                    if(charge > 250000)
                        charge = 250000;
                }
                else if(money < 200000000){
                    charge = money / 1000 * 5;
                    if(charge > 800000)
                        charge = 800000;
                }
                else{
                    charge = money / 1000 * 4;
                }
            }
            else{
                if(money < 20000000){
                    charge = money / 1000 * 5;
                    if(charge > 70000)
                        charge = 70000;
                }
                else if(money < 50000000){
                    charge = money / 1000 * 5;
                    if(charge > 200000)
                        charge = 200000;
                }
                else if(money < 100000000){
                    charge = money / 1000 * 4;
                    if(charge > 300000)
                        charge = 300000;
                }
                else{
                    charge = money / 1000 * 3;
                }
            }

            System.out.printf("The charge is %d\n", charge);
            System.out.print("\n");
            total_charge += charge;
        }
        System.out.printf("Total charge is %d\n", total_charge);
    }
}
