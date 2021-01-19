package problems;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
public class problem19 {
    public static void main(String[] args) {
        problem19 probClass = new problem19();
        int dayCounter =0;
        for(int i=1901;i<=2000;i++){
            for(int j =0; j<12; j++){
                if (probClass.getday(new GregorianCalendar(i,j,1).getTime())==1){
                    dayCounter++;
                    }
                }

            }

        System.out.println(dayCounter);
    }
    public int getday(Date date){
        Calendar calendar = new GregorianCalendar();

        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_WEEK);

    }
}
