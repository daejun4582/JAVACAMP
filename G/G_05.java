package G;

import java.util.Scanner;

public class G_05 {
    void g05() {
        Scanner sc = new Scanner(System.in);
        int totalFee = 0;
        while (true) {
            System.out.print("Enter hours and minutes of use > ");
            int hours = sc.nextInt();
            int minutes = sc.nextInt();

            if (hours == 0 && minutes == 0) {
                break;
            }
            int fee;
            // Calculate the fee for the entered hours and minutes

            if(0<minutes&& minutes<=30) fee = hours * 2000 + 1000;
            else if (minutes ==0) fee = hours * 2000;
            else fee = hours * 2000 + 2000;



            // Check if any discounts apply
            if (hours >= 2 && hours < 3) {
                fee = (int) (fee * 0.95);
            } else if (hours >= 3 && hours < 5) {
                fee = (int) (fee * 0.9);
            } else if (hours >= 5) {
                fee = (int) (fee * 0.8);
            }

            // Add the fee to the total
            totalFee += fee;

            System.out.println("Your charge is " + fee );
            System.out.println();
        }

        System.out.println("Your total charge is " + totalFee);
    }
}
