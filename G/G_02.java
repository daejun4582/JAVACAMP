package G;

import java.util.Scanner;

public class G_02 {
    void g02() {
        Scanner s = new Scanner(System.in);
        double[] degrees = new double[10];
        String[] degree_name = {"cold water", "warm water", "hot water", "boiling water"};
        int[] count = {0,0,0,0};
        int i;
        int sel;

        for(i = 0; i<10; i++){
            System.out.print("Enter water temperature > ");
            degrees[i] = s.nextDouble();

            if(degrees[i] < 0){
                System.out.print("Invalid Input\n");
                i--;
            }
        }

        System.out.print("\n");

        for(i =0; i<10; i++){
            if(degrees[i] < 25){
                sel = 0;
            }
            else if(degrees[i] < 40){
                sel = 1;
            }
            else if(degrees[i] < 80){
                sel = 2;
            }
            else{
                sel =3;
            }

            System.out.printf("%dth water temperature is %.1f %s\n", i+1, degrees[i], degree_name[sel]);
            count[sel]++;
        }

        System.out.print("\n");

        for(i = 0; i<4; i++){
            System.out.printf("Count of %s is %d\n", degree_name[i], count[i]);
        }
    }
}
