package myProjects.mestralWahala;

public class NextPeriodDate {
    private String date;
    private String month;
    private int day;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "NextPeriodDate{" +
                "date='" + date + '\'' +
                ", month='" + month + '\'' +
                ", day=" + day +
                '}';
    }
}
