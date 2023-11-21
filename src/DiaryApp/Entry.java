package DiaryApp;

import java.time.LocalDateTime;

public class Entry {
    private int entryNo;
    private String title;
    private  String body;
    private LocalDateTime date;


    public Entry (int entryNo,String title,String body){
        this.entryNo = entryNo ;
        this.title = title;
        this.body = body;
    }
}


