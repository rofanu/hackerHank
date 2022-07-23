package com.rodolfo.hackerHank.OneWeekPreparation.dayOne;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:05:45AM"));
    }

    public static String timeConversion(String s){
        Integer hour = Integer.valueOf(s.substring(0,2));
        String minutesSeconds = s.substring(2,8);
        String indicator = s.substring(8);
        if (indicator.equals("PM")) {
            if (hour != 12) {
                return (hour + 12) + minutesSeconds;
            }
            else {
                return hour + minutesSeconds;
            }
        } else{
            if (hour != 12) {
                return String.format("%02d", hour) + minutesSeconds;
            }
            else {
                return "00" + minutesSeconds;
            }
        }
    }

}
