package model;

import java.util.Calendar;

public class CalendarDate {
	static public String[] getYears() {
        String[] str = new String[201];
         
        for (int i = 1900, j = 0; i < 2100; i++, j++) {
            str[j] = String.valueOf(i);
        }
         
        return str;
    }
	
	static public String[] getMonths() {
        String str[] = {"Styczen", "Luty", "Marzec", "Kwiecen", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik", "Listopad", "Grudzien"};
        return str;
    }
	
	static public String[] getDayNames(){
		String[] dayNames = {"PN", "WT", "ŒR", "CZW", "PT", "SB", "NIED"};
    return dayNames;
	}
	
	protected void updateCalendar(int year, int month) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         
        int y = 1900;
        int m = 0;
        int day = 0;
         
        while (colbeKina(year, month, y, m)) {
            if (month == 1 && leapYear(year)) {
                day += 29;
            }
            else {
                day += monthDays[month];
            }
             
            m++;
            if (m == 12) {
                m = 0;
                y++;
            }
 
//            day = day % 7;
        }
         
        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);
         
        int day_of_week = c.get(Calendar.DAY_OF_WEEK);
        day = Math.floorMod(day_of_week - 2, 7);
 
//        for (int i = 0; i < textFields.length; i++) {
//            textFields[i].setText("");
//        }
//        for (int i = 1, j = day; i <= monthDays[month]; i++, j++) {
//            textFields[j].setText(String.valueOf(i));
//            textFields[j].setFocusPainted(true);
//        }
    }

	public static int getDaysInMonth(int year, int month) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         
        int y = 1900;
        int m = 0;
        int day = 0;
        int daysInMonth = 0;
         
        while (colbeKina(year, month, y, m)) {
            if (month == 1 && leapYear(year)) {
            	daysInMonth = 29;
                
            }
            else {
            	daysInMonth = monthDays[month];
            }
             
            m++;
            if (m == 12) {
                m = 0;
                y++;
            }
 System.out.println(daysInMonth);
        }
        return daysInMonth;
    }
	public static int getFirstDayOfWeek(int year, int month) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         
        int y = 1900;
        int m = 0;
        int day = 0;
         
        while (colbeKina(year, month, y, m)) {
            if (month == 1 && leapYear(year)) {
                day += 29;
            }
            else {
                day += monthDays[month];
            }
             
            m++;
            if (m == 12) {
                m = 0;
                y++;
            }
 
//            day = day % 7;
        }
         
        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);
         
        int day_of_week = c.get(Calendar.DAY_OF_WEEK);
        day = Math.floorMod(day_of_week - 2, 7);
        return day;
    }
	
	private static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            return true;
        }
        return false;
    }
 
    private static boolean colbeKina(int year, int month, int y, int m) {
        if (year == y && month == m) {
            return false;
        }
        return true;
    }
	
	
}
