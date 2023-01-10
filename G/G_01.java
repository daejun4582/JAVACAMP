package G;

import java.util.Scanner;

public class G_01 {
    void g01() {
        Scanner sc = new Scanner(System.in);
        // A list to store the ages of the people
        int[]age = new int[100];
        int numInfants = 0;
        int numChildren = 0;
        int numTeens = 0;
        int numYoungAdults = 0;
        int numAdults = 0;
        int numElders = 0;
        int count=0;

        // Repeatedly ask the user for their birth year until a year greater than 2021 is entered
        int birthYear;
        do {
            System.out.printf("Enter a birth year of %dth person > ",count+1);
            birthYear = sc.nextInt();
            age[count] = 2021 - birthYear + 1;
            count++;
            // Increment the appropriate age group counter
            if (age[count-1] < 2) {
                numInfants++;
            } else if (age[count-1] < 13) {
                numChildren++;
            } else if (age[count-1] < 20) {
                numTeens++;
            } else if (age[count-1] < 30) {
                numYoungAdults++;
            } else if (age[count-1] < 60) {
                numAdults++;
            } else {
                numElders++;
            }
        } while (birthYear <= 2021);
        System.out.println();
        for(int i = 0; i<count-1; i++){
            System.out.printf("%dth person are %d years old.\n",i+1,age[i]);
        }
        System.out.println();
        // Print the number of people in each age group
        System.out.printf("There are %d babys.\n",numInfants-1);
        System.out.printf("There are %d childs.\n",numChildren );
        System.out.printf("There are %d youths.\n",numTeens );
        System.out.printf("There are %d youngs.\n",numYoungAdults);
        System.out.printf("There are %d adults.\n",numAdults );
        System.out.printf("There are %d olds.\n",numElders );

    }
}
