package ch05;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1-> today=Week.SUNDAY;
            case 2-> today=Week.MONDAY;
            case 3-> today=Week.TUESDAY;
            case 4-> today=Week.WENESDAY;
            case 5-> today=Week.THURSDAY;
            case 6-> today=Week.FRIDAY;
            case 7-> today=Week.SATURDAY;

        }

        if(today==Week.WENESDAY){
            System.out.println("오늘은 수요일 입니다.");
        }
        else
            System.out.println("열심히 자바를 공부합니다.");
    }
}
