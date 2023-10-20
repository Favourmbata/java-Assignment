package Assignment.Mbti;

//
import java.util.Scanner;

public class FavourMBTI {

     Scanner scanner = new Scanner(System.in);

     int extrovertCount = 0;
     int introvertCount = 0;
     int sensitiveCount = 0;
     int thinkerCount = 0;
     int feelerCount = 0;
     int judgement = 0;
     int perspertiveCount = 0;


     int numberA = 0;
     int numberB = 0;
     String feedBack = "feedBack";

     String question1A = "A.Expend energy,enjoy groups";
     String question1B = "Conserve energy,enjoy one-on one";
     String question2A = "Interpret,thinking";
     String question2B = "Look for meaning and possibilities";
     String question3A = "Logical thinking,questioning";
     String question3B = "Emphaetic,feeling,accommadating";
     String question4A = "Organised,orderly";
     String question4B = "Flexible,adaptable";
     String question5A = "More outgoing ,think out loud";
     String question5B = "More reserved,think to yourself";
     String question6A = "Practical,realistic,experiential";
     String question6B = "imaginative,innovative,theoritical";
     String question7A = "Candid,straight forward,frank";
    String question7B = "tactful,kind,encouraging";

     String question8A ="Plan,schedule";
     String question8B = "unplanned,spontaneous";
     String question9A = "seek many tasks,public activities,interaction with others";
     String question9B = "seek private,solitary activities with quite to concentrate";
     String question10A = "Standard,usual,conventional";
     String question10B = "different,novel unique";
     String question11A = "Firm,tend to criticise,hold the line";
    String question11B = "gentle,tend to appreciate,conciliate";
    String question12A = "Regulated,structured";
    String question12B = "easy-going,live and let live";
    String question13A = "External,communicative,express yourself";
    String question13AB = "internal,reticent,keep to yourself";
    String getQuestion14A = "Focus on here-and-now";
    String getQuestion14B = "look to the future,global perspective,big picture";
    String question15A = "Tough-minded,just";
    String question15B = "tender-hearted,merciful";
    String question16A = "Preparation,plan ahead";
    String question16B = "go with the flow,adapt as you go";

    String question17A = "Active,initiate";
    String question17B = "reflective,deliberate";
    String question18A = "Facts,things,what is";
    String question18B = "ideas,dreams,what could be,philosphical";
    String question19A = "Matter of fact,issue-oriented";
    String question19B = "senstive,people-oriented,compassionate";
    String question20A = "Control,govern";
    String question20B = "latitude,freedom";

    private String name;
     public void setName (String name){
         this.name = name;
     }
     public String getName(){
         return  name;
     }
     public  void myersBrigs(String myersBrigs) {
         System.out.println("what is your name");
         setName(scanner.next());
         scanner.next();
         System.out.println(myersBrigs.equalsIgnoreCase("A"));
         System.out.println(myersBrigs.equalsIgnoreCase("B"));
         {

         }
     }





    public static void main(String[] args) {
   MyerBriggs myerBriggs = new MyerBriggs();
   myerBriggs.myerBrigsPartA();

    }
}


