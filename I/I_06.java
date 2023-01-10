package I;
import java.util.Random;
public class I_06 {
    Random random = new Random();
    void i06() {
        int[] l = new int[3];


        System.out.println("Generating 10 numbers...");

        for(int i =0; i<10; i++){
            l[GetRandom()]++;
        }

        System.out.printf("\n1. Big (>= 70) : %d\n", l[0]);
        System.out.printf("2. Normal (>= 40) : %d\n", l[1]);
        System.out.printf("3. Small (< 40) : %d\n", l[2]);
    }

    byte GetRandom(){
        int n = random.nextInt(100) + 1;
        System.out.printf("Generated random number is %d\n", n);

        if(n >= 70){
            return 0;
        }
        else if(n >= 40){
            return 1;
        }
        else{
            return 2;
        }
    }
}
