package problems;
import com.google.common.math.BigIntegerMath;

import java.math.BigInteger;

public class problem20 {


    public static void main(String[] args) {
       BigInteger big =BigIntegerMath.factorial(100);
        String digits = big.toString();
        int sum = 0;

        for(int i = 0; i < digits.length(); i++) {
            int digit = (int) (digits.charAt(i) - '0');
            sum = sum + digit;
        }
        System.out.println(sum);
    }
    //
}
