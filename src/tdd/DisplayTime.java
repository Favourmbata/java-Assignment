package tdd;

public class DisplayTime {
    private  int seconds;
    private  int minute;
    private int years;



    public void setMinute(int minute) {
        if (minute > 0) this.minute =  minute;
    }

    public int getSeconds() {
        if (minute > 0) this.seconds = minute * 60;
        return seconds;
    }

    public int getMinutes() {
        return  minute;
    }
    public int getYears(){
        if (minute > 0)
            this.years = minute / 525600;
        return years;
    }





    }
