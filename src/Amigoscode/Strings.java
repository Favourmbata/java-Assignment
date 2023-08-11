package Amigoscode;

public class Strings {

    public static void main(String[] args) {

    String number = String.valueOf(1);
        System.out.println(number);
    String format = String.format("Number %s",number);
        System.out.println(format);
    String [] names = {"Jumila,Alex,Mary"};
            String join = String.join(",",names);
        System.out.println(join);



    }



}
