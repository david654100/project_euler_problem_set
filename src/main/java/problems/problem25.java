/*
The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
package problems;

import java.math.BigInteger;
import java.util.ArrayList;

public class problem25 {
    public static void main(String[] args) {
        BigInteger MAX = BigInteger.valueOf(10);
        MAX = MAX.pow(999);
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(2);
        BigInteger c = BigInteger.valueOf(0);
        int i = 3;
        for (i = 3; b.compareTo(MAX) < 0; i++)
        {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(i);



    }
}
//4782
