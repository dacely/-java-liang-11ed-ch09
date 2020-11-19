package com.exercises;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class E05_GregorianCalendar
{
    public static void main(String[] args)
    {
        System.out.println("Hoy:");
        GregorianCalendar gc = new GregorianCalendar();
        printDate(gc);

        System.out.println("\nDavid:");
        GregorianCalendar david = new GregorianCalendar(1985, 4, 5,9, 25);
        printDate(david);

        System.out.println("\nNora:");
        GregorianCalendar nora = new GregorianCalendar(1957, 0, 17,19, 57);
        printDate(nora);

        System.out.println("\nArgentina:");
        TimeZone tz = TimeZone.getTimeZone("GMT-3");
        gc = new GregorianCalendar(tz);
        printDate(gc);

        System.out.println("\nMilliseconds:");
        gc = new GregorianCalendar();
        gc.setTimeInMillis(1234567898765L);
        printDate(gc);
    }

    public static void printDate(GregorianCalendar date)
    {
        String[] monthAbr = {  "Ene", "Feb", "Mar", "Abr",
                            "May", "Jun", "Jul", "Ago",
                            "Sep", "Oct", "Nov", "Dic"};

        String[] dayName = {"Domingo", "Lunes", "Martes", "Miercoles",
                "Jueves", "Viernes", "Sabado"};

        String[] amPm = {"AM", "PM"};

        System.out.printf("Date: %s %02d-%s-%d\n",
                dayName[date.get(Calendar.DAY_OF_WEEK) - 1],
                date.get(Calendar.DAY_OF_MONTH),
                monthAbr[date.get(Calendar.MONTH)],
                date.get(Calendar.YEAR));
        System.out.printf("Time: %02d:%02d:%02d %s\n",
                date.get(Calendar.HOUR),
                date.get(Calendar.MINUTE),
                date.get(Calendar.SECOND),
                amPm[date.get(Calendar.AM_PM)]);
        System.out.printf("Time Zone: %s\n", date.getTimeZone().getDisplayName());
    }
}
