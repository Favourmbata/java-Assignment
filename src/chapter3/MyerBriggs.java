package Assignment.Mbti;

import java.util.ArrayList;
import java.util.Scanner;

public class MyerBriggs {


     int A = 0;
     int B = 0;
    private  String userName;
    ArrayList<String> feedBack = new ArrayList<>();
    String question1A = "tough-minded,just";
    String question1B = "tender-hearted, mercyful";
    String question2A = "candid,straight forward,frank";
    String question2B = "tactful,kind,encouraging";
    String question3A = "focus on here - and now ";
    String qustion3B = "look to the future,global perspective,big pictiure";
    String question4A = "control, govern";
    String question4B = "latitude,freedom";
    String partBQuestion1A = "external,communicative,express";
    String PartBQuestion1B = "gentle,tend to appreciate,conciliate";
    String PartBQuestion2A = ""
    Scanner input = new Scanner(System.in);
  private void print(String word){
      System.out.println(word);
  }
  private void print(int word){
      System.out.println(word);
  }
  public  void setUserName(String userName){
      this.userName = userName;
  }


   public String getUserName(){
      return userName;
   }
  public void myerBrigsPartA(){
      print("what is your name");
                userName = input();
String answer = questioner(question1A,question1B);
   if (answer.equalsIgnoreCase("A")){
        feedBack.add(question1A);
        A++;
   }
   if (answer.equalsIgnoreCase("B")){
       feedBack.add(question1B);
    B++;
   }
    answer = questioner(question2A,question2B);
   if (answer.equalsIgnoreCase("A")){
       feedBack.add(question2A);
    A++;
   }
   if (answer.equalsIgnoreCase("B")){
       feedBack.add(question2B);
    B++;
   }
   answer = questioner(question3A,qustion3B);
   if (answer.equalsIgnoreCase("A")){
       feedBack.add(question3A);
      A++;
   }
    if (answer.equalsIgnoreCase("B")){
        feedBack.add(qustion3B);
       B++;
    }
    answer = questioner(question4A,question4B);
    if (answer.equalsIgnoreCase("A")){
        feedBack.add(question4A);
       A++;
    }
    if (answer.equalsIgnoreCase("B")){
        feedBack.add(question4B);
      B++;
    }
      for (int i = 0; i < feedBack.size(); i++) {
          print(feedBack.get(i));
      }
      print("number of A -> "+A);
      print("number of B -> "+B);
  }

   private String input(){
      String word = input.next();
      return word;
   }

   private String questioner(String question1, String question2 ){
       String response2 = "";
      while (true){
          print("please enter only A or B \n");
          print("A."+question1+"        B."+question2);
           response2 = input.next();

          if (  response2.equalsIgnoreCase("A")||  response2.equalsIgnoreCase("B")){
              return response2;
          }
          print("i know this is an error ,please retry again");

      }
   }

     public void myerBrigsPartB(){




     }




    public static void main(String[] args) {
        MyerBriggs myerBriggs = new MyerBriggs();


        myerBriggs.myerBrigsPartA();
    }


}




