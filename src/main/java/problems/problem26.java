package problems;

import org.jetbrains.annotations.Contract;

public class problem26 {
    private static final int LIMIT = 1000;
    public static void main(String[] args) {
        int result = 0;
        int longest = 0;
        for (int i=2; i<LIMIT; i++){
            int recurringNum = recurringNum(i);
            if (recurringNum > longest){
                longest = recurringNum;
                result = i;
            }
        }
        System.out.println(result);
    }
    @Contract(pure = true)
    public static int recurringNum(int num) {
        int[] arr = new int[num+1];
        int index = 1;
        int mod = 1;
        while(mod != 0 && arr[mod] == 0){
            arr[mod]=index++;
            mod = mod * 10 % num;
        }
        if (mod == 0){
            return 0;
        }
        return index-arr[mod];
    }
}