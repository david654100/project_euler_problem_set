package problem17;


import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

import java.util.Locale;

public class problem17 {
    public static void main(String[] args) {
    System.out.println(numberToWord(1,1000));
    }

    static int numberToWord(int low, int high){
        ULocale locale = ULocale.UK;
        NumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
        StringBuilder words = new StringBuilder();

        for(int i = low; i<=high; i++) {
            System.out.println(formatter.format(i));
        words.append(formatter.format(i));
        if (i>100 && i%10 !=0){
            words.append("and");
        }
        }
        String word = words.toString();
       word =  word.replace(" ","");
       word =  word.replace("-","");


        return word.length();
    }

//21124
}
