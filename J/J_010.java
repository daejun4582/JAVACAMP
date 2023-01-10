package J;

public class J_010 {
    void j10() {
        double ratio;
        int i = 3;
        int a,b;
        double back=0;
        while(true){
            a = fibonacci(i);
            b = fibonacci(i-1);
            ratio = a/(double)b;
            System.out.printf("%dth ratio (%d / %d) : %f\n",i-1,a,b,ratio);
            if(0<(ratio-back) && (ratio-back)<(1/1000000.0)) break;
            back = ratio;
            i++;
        }
    }

    int fibonacci(int k){
        if (k <= 1)
            return k;
        else
            return fibonacci(k-2) + fibonacci(k-1);

    }
}
