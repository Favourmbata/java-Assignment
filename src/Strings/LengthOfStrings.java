package Strings;

public class LengthOfStrings {
      public static void getLengthOfString(){
          String x = "ABC tech";
//          x = x.concat("\0");
//          char y[]= x.toCharArray();
//          int count = 0;
//          int i = 0;
//          while (y[i]!='\0'){
//              count++;
//              i++;
//          }
//          System.out.printf("%d",count);
//          System.out.printf("%s",x.charAt(6));
          System.out.printf("%s",x.length());
      }

    public static void main(String[] args) {
        getLengthOfString();
    }
}
