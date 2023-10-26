package Amigoscode;

public class Match {
    public static void main(String[] args) {
       String x = "hello";
       char [] y = x.toCharArray();
       int size = y.length;
       char a [] = new char[size];

       int i = 0;
      while (i != size){
          a[size-1-i] = y[i];
          i++;
      }
         i = 0;
        while (i!= size){
            if (a[i] != y[i]){
                System.out.println("Not a palindrome");
            }else {
//                i++;
            }
        }
        System.out.println("its palindrome");
    }
}
