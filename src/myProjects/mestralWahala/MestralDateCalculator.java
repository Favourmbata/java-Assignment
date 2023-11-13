package myProjects.mestralWahala;

import java.time.LocalDateTime;

public class MestralDateCalculator {


    public NextPeriodDate flowDateCalculator(String startedDay, String startedMonth, int firstDateOfLastPeriod){
        int saveFirstDateOfperiod = firstDateOfLastPeriod;
        if (!checkDateValue(startedDay,startedMonth)) throw new RuntimeException("Please enter correct value:");
        int datePeriodStarted = Integer.parseInt(startedDay);
        int monthPeriodstarted = Integer.parseInt(startedMonth);
        int newPeriod = firstDateOfLastPeriod + datePeriodStarted;
        NextPeriodDate nextPeriodDate = new NextPeriodDate();
        nextPeriodDate.setDate(String.valueOf(nextPeriodDate));
        nextPeriodDate.setMonth(startedMonth);

        return nextPeriodDate;
    }
    public boolean checkDateValue(String startedDay, String startedMonth){
        for (int i = 0; i < startedDay.length() ; i++) {
            if (!Character.isDigit(startedDay.charAt(i)) || !Character.isDigit(startedMonth.charAt(i)) ){
                System.out.println("invalid date  or month value input <<<<<<<<<<<<<<<<<<<<<<<<<");
                return false;
            }
        }
        int dateOfPeriod = Integer.parseInt(startedDay);
        int monthOfPeriod = Integer.parseInt(startedMonth);

        if (monthOfPeriod < 0 || monthOfPeriod > 12){
            System.out.println("invalid date in or month value input <<<<<<<<<<<<<<<<<<<<<<<<<");
            return  false;
        }
        if (dateOfPeriod < 0 || dateOfPeriod > 31){
            System.out.println("invalid date in or month value input <<<<<<<<<<<<<<<<<<<<<<<<<");
            return false;
        }
        if (monthOfPeriod == 2){
            if (dateOfPeriod > 29 || dateOfPeriod < 0){
                System.out.println("invalid date in or month value input <<<<<<<<<<<<<<<<<<<<<<<<<");
                return false;
            }
        }
        return true;
    }

}
