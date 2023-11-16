package MenstralPackage;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MenstralApp {

    private String flowDate;
    private  int cycleLength;
    private int lastDateOfPeriod;

    public MenstralApp(String date,int cycleLength) {
        this.flowDate = date;
        this.cycleLength = cycleLength;
    }
    public String getOvulationDate(){
        int daysToOvulate = (cycleLength)/2;
        return addDaysToDate(lastDateOfPeriod,daysToOvulate);
    }

    private static String addDaysToDate(int dateInputed,int day) {
        try {
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            Date endDate = dateformat.parse(String.valueOf(dateInputed));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(endDate);
            calendar.add(Calendar.DAY_OF_MONTH,day);

            Date result = calendar.getTime();
            return String.format("%s",dateformat.format(result));

        }
        catch ( ParseException e){
            throw new IllegalArgumentException("Date formate is invalid,correct format(yyyy-MM-dd)");
        }
    }

}
