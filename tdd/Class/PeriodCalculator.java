package Class;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PeriodCalculator {


    public String getOvulationDate(String lastDateOfPeriod, int cycleLength, int flowdays) {
        int ovulationDate = (cycleLength) / 2;
        return addDaysToDate(lastDateOfPeriod, ovulationDate);
    }

    private static String addDaysToDate(String dateInputed, int days) {
        return null;
    }
}
