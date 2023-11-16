package Strings;

public class VerifyStrings {
    public static void verifyStringIfContainsInteger(){
        String string = "123bnm";
//        char[]extract = string.toCharArray();
//        int size = extract.length;
        int size = string.length();

        int i = 0;
        while (i != size){
            if (string.charAt(i) >= '0' && string.charAt(i)<= '9' ){
                i++;
            }else {
                System.out.println("This is a string character");
                System.exit(0);
            }
        }
//            if (extract[i] >= '0' && extract[i] <= '9'){
//                i++;
//            }else {
//                System.out.println("Not an integer string");
//                System.exit(0);
//            }
//        }
        System.out.println("This is an integer");
    }


    public static void main(String[] args) {
        verifyStringIfContainsInteger();
    }

}
