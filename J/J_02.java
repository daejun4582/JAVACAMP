package J;

import java.util.Scanner;

public class J_02 {
    Scanner s = new Scanner(System.in);

    void j02() {

        double[] num = new double[10];
        double max, min;
        double total = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Enter %dth score > ", i + 1);
            num[i] = s.nextDouble();
        }

        max = Max(num);
        min = Min(num);

        for (int i = 0; i < num.length; i++) {
            if (num[i] == max || num[i] == min) {
                continue;
            }

            total += num[i];
        }

        total = total / 8.0;

        System.out.printf("Average is %.1f", Math.floor(total * 10) / 10.0);

    }

    double Max(double num[]) {
        double max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }

        return max;
    }

    double Min(double num[]) {
        double min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }
        return min;
    }
}
