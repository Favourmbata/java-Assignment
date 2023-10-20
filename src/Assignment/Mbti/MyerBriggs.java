package Assignment.Mbti;

import java.util.ArrayList;
import java.util.Scanner;

public class MyerBriggs {


   int A = 0;
  int B = 0;


    private String userName;
    ArrayList<String> feedBack = new ArrayList<>();
     String question1A = "Expend energy,enjoy groups,";
     String question1B = "conserve energy,enjoy one-on-one";
    String question2A = "Interpret literally";
    String question2B = "look for meaning and possibilities";
    String question3A = "Logical, thinking,questioning";
    String qustion3B = "Emphaetic,feeling,accomodating";
    String question4A = " Organised,orderly";
    String question4B = "flexible,adaptable";
    String question5A = " More outgoing,think out loud";
    String question5B = ".more reserved,think to yourself";
    String question6A = " Practical,realistic,experiental";
    String question6B = "imaginative,innovative,theoretical";
    String question7A = " Candid,straight forward,frank";
    String question7B = "tactful,kind,encouraging";
    String question8A = "Plan,schedule";
    String question8B = ".unplanned,spontaneous";
    String question9A = " seek many tasks,public activities,interaction with others";
    String question9B = "seek private,solitary activities with quite to concentrate";
    String question10A = " Standard,usual,conventional";
    String question10B = "different,novel unique";
    String question11A = "Firm,tend to criticise,hold the line";
    String question11B = "gentle,tend to appreciate,conciliate";
    String question12A = " Regulated,structure";
    String question12B = "easy-going,live and let live";
    String question13A = "External,communicative,express yourself";
    String question13B = "internal,reticent,keep to yourself";
    String question14A = " Focus on here-and-now";
    String question14B = "look to the future,global perspective,big picture";

    String question15A = "Tough-minded,just";
    String question15B = "tender_hearted merciful";
    String question16A = "Preparation,plan ahead";
    String question16B = "go with the flow,adapt as you go";
    String question17A = " Active,initiate";
    String question17B = "reflective,deliberate";
    String question18A = " Facts,things,what is,";
    String question18B = "ideas,dreams,what could be,philosphical";
    String question19A = " Matter of fact,issue-oriented,";
    String question19B = "senstive,people-oriented,compassionate";
    String question20A = "Control,govern";
    String question20B = "latitude,freedom";

    Scanner input = new Scanner(System.in);

    private void print(String word) {
        System.out.println(word);
    }

    private void print(int word) {
        System.out.println(word);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserName() {
        return userName;
    }

    public void myerBrigsPartA() {
        print("what is your name");
        userName = input();
        String answer = questioner(question1A, question1B);
        if (answer.equalsIgnoreCase("A")) {
            feedBack.add(question1A);
            A++;
        }

        if (answer.equalsIgnoreCase("B")) {
            feedBack.add(question1B);
            B++;
        }
        answer = questioner(question2A, question2B);
        if (answer.equalsIgnoreCase("A")) {
            feedBack.add(question2A);
            A++;
        }
        if (answer.equalsIgnoreCase("B")) {
            feedBack.add(question2B);
            B++;
        }
        answer = questioner(question3A, qustion3B);
        if (answer.equalsIgnoreCase("A")) {
            feedBack.add(question3A);
            A++;
        }
        if (answer.equalsIgnoreCase("B")) {
            feedBack.add(qustion3B);
            B++;
        }
        answer = questioner(question4A, question4B);
        if (answer.equalsIgnoreCase("A")) {
            feedBack.add(question4A);
            A++;
        }
        if (answer.equalsIgnoreCase("B")) {
            feedBack.add(question4B);
            B++;
        }
        answer = questioner(question5A, question5B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question5A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question5B);
        B++;

        answer = questioner(question6A, question6B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question6A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question6B);
        B++;
     answer = questioner(question7A, question7B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question7A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question7B);
        B++;

        answer = questioner(question8A, question8B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question8A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question8B);
        B++;

        answer = questioner(question9A, question9B);
        feedBack.add(question9A);
        A++;


        answer = questioner(question10A, question10B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question10A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question10B);

        B++;

        answer = questioner(question11A, question11B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question11A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question11B);
        B++;
        answer = questioner(question12A, question12B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question12A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question12B);
        B++;
        answer = questioner(question13A, question13B);
        feedBack.add(question13A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question13B);
        B++;

        answer = questioner(question14A, question14B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question14A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question14B);
        B++;
        answer = questioner(question15A, question15B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question15A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question15B);
        B++;
        answer = questioner(question16A, question16B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question16A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question16B);
        B++;

        answer = questioner(question17A, question17B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question17A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question17B);
        B++;

        answer = questioner(question18A, question18B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question18A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question18B);
        B++;
        answer = questioner(question19A, question9B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question19A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question19B);
        B++;
        answer = questioner(question20A, question20B);
        if (answer.equalsIgnoreCase("A"))
            feedBack.add(question20A);
        A++;
        if (answer.equalsIgnoreCase("B"))
            feedBack.add(question20B);
        B++;
        for (int i = 0; i < feedBack.size(); i++) {
            print(feedBack.get(i));
        }

//
//        print("number of A -> " + A);
//        print("number of B -> " + B);




            if (A > B) {
                System.out.print("Extrovert");
            } else {
                System.out.print("Introvert");
            }
            if (A > B) {
                System.out.print("Sensitive");
            } else {
                System.out.print("INtuitive");
            }
            if (A > B) {
                System.out.print("Thinkers");
            } else {
                System.out.print("Feeler");
            }
            if (A > B) {
                System.out.print("Judging");
            } else {
                System.out.print("Perspective");
            }

        }

    private String input() {
        String word = input.next();
        return word;
    }

    private String questioner(String question1, String question2) {
        String response2 = "";
        while (true) {
            print("please enter only A or B \n");
            print("A." + question1 + "        B." + question2);
            response2 = input.next();

            if (response2.equalsIgnoreCase("A") || response2.equalsIgnoreCase("B")) {
                return response2;
            }
            print("i know this is an error ,please retry again");

        }
    }


    public static void main(String[] args) {
        MyerBriggs myerBriggs = new MyerBriggs();
        myerBriggs.myerBrigsPartA();

    }}