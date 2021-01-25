package problems;

import com.google.common.collect.Collections2;

import java.util.ArrayList;
import java.util.Arrays;


import static com.google.common.collect.Collections2.orderedPermutations;

public class problem24 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(orderedPermutations(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));

       System.out.println(list.get(999999));

    }
}
//[2, 7, 8, 3, 9, 1, 5, 4, 6, 0]