package MyOwn;

import java.util.Arrays;

public class Anagram {


    public static void main(String[] args) {


//        String x = "evil";
//        String y = "live";
//        char a[] = x.toCharArray();
//        char b[] = y.toCharArray();
//        Arrays.sort(a);
//        Arrays.sort(b);
//        Boolean result = Arrays.equals(a, b);
//        if (result == true) {
//            System.out.println("Strings are anagrams");
//        } else {
//            System.out.println("Strings are not anagram");
//        }

     String str = "madam";
        String rev  = " ";
        char save;
        for (int i = 0; i < str.length() ; i++) {
            save = str .charAt(i);
           rev =  save + rev;
        }
        if (str.equals(rev)){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }

}

