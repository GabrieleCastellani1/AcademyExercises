package it.euris.academy2023.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        Date date = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        Date today = cal.getTime();

        System.out.println(today);

        cal.setTime(today);
        cal.add(Calendar.DAY_OF_MONTH, -10);

        Date tenDaysAgo = cal.getTime();
        System.out.println(tenDaysAgo);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String readableDateToday = sdf.format(today);

        System.out.println(readableDateToday);

        Date parsedDate = sdf.parse("25/12/2025");

        System.out.println(parsedDate);


        LocalDate lToday = LocalDate.now();
        LocalDate tenYearsAgo = LocalDate.parse("27-05-2013");

        // 18-01-2023


    }
}
