package MenstralApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MenstralWahala {

    private String dateForLastPeriod;
    private int cycleLength;
    private int flowDate;

    public MenstralWahala(String dateForLastPeriod, int cycleLength, int flowDate) {
        this.dateForLastPeriod = dateForLastPeriod;
        this.cycleLength = cycleLength;
        this.flowDate = flowDate;
    }

   public String getOvulationDay(){
        int daysToOvulate = (cycleLength + flowDate)/2;
        return addDaysToDate(dateForLastPeriod,daysToOvulate);
   }

     public String getFertilityDate(){
       return addDaysToDate(getOvulationDay(),-2);
       
     }
    public String fertilityEndOfDate(){
        return addDaysToDate(getOvulationDay(),2);
    }
    public String getdateForNextPeriod(){
        int lentgthOfCycle = getCycleLength();
        return getdateForNextPeriod();
    }

    private int getCycleLength() {
   return 0;
    }

    private static String addDaysToDate(String dateInputed, int days) {
    try {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date endDate = dateformat.parse(dateInputed);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(endDate);
        calendar.add(Calendar.DAY_OF_MONTH,days);
    
        Date result = calendar.getTime();
        return String.format("%s",dateformat.format(result));
        
    }
    catch ( ParseException e){
        throw new IllegalArgumentException("Date formate is invalid,correct format(yyyy-mm-dd)");
    }
    
    
    
    }

}
