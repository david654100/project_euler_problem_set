package problems;
import com.google.common.math.IntMath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class problem27 {
    public static void main(String[] args) {
        int aMax=0;
        int bMax =0;
        int nMax = 0;

        ArrayList<Integer> listOfprimes= new ArrayList(sieveOfEratosthenes(87400));
        for (int a = -1000; a <= 1000; a++) {
            for(int b = -1000; b <= 1000; b++){
                int n = 0;
                while (IntMath.isPrime(Math.abs(n * n + a * n + b))) {
                    n++;
                }
                if (n > nMax) {
                    aMax = a;
                    bMax = b;
                    nMax = n;
                }
            }
        }

        System.out.println(aMax);
        System.out.println(bMax);
        System.out.println(nMax);
        System.out.println(aMax*bMax);



    }
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

}
