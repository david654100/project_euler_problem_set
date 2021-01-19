package tests;

import problems.problem19;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;

class problem19Test {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getdayIsSunday() {
        Date date = new GregorianCalendar(2021, Calendar.JANUARY, 17).getTime();
        problem19 test = new problem19();
        assertEquals(1,test.getday(date));


    }
}