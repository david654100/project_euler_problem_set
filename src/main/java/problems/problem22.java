package problems;

import org.jetbrains.annotations.NotNull;
import au.com.bytecode.opencsv.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value
 for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 */
public class problem22 {

    private static String alphabet = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static int alphabeticalValueOfTheName(String name) {
        int nameScore = 0;
        int i=0;
        while (i < name.length()) {
            char value = name.charAt(i);
            nameScore += alphabet.indexOf(value);
            i++;
        }
        return nameScore;

    }
    public static void main(String[] args) {


        String [] nextLine;
        int count =1;
        int nameScore;
        int TotalOfAllNameScores = 0;
        try {
            CSVReader reader = new CSVReader(new FileReader("helperFiles/p022_names.txt"));


            while ((nextLine = reader.readNext()) != null) {
                Arrays.sort(nextLine);
                for (String str : nextLine) {

                    nameScore = count*alphabeticalValueOfTheName(str);

                    count++;
                    TotalOfAllNameScores += nameScore;
                }
                System.out.println("Total of all name scores: " + TotalOfAllNameScores);

            }

        }
        catch(IOException e) {
            System.out.println("Problem occured in finding file or reading it");
        }

    }
}
//871198282


