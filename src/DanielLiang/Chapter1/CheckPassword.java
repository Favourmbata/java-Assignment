package DanielLiang.Chapter1;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = input.nextLine();
        if(isValidPassord(password)){
            System.out.println("valid password:");
        }else {
            System.out.println("invalid password:");
        }

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter password: ");
//        String password = input.nextLine();
//
//        System.out.println(isValidPassword(password)?"valid " : "invalid" + "password");

    }

    private static boolean isValidPassord(String password) {
     if (password.length() < 8){
         return false;
     }
      if (!password.matches("^[a-zA-Z0-9]+$")){
          return false;
      }
     int count = 0;
      for (char value:password.toCharArray()){
          count++;
          if (count >= 2){
              break;
          }
      }
       return count >=2;
    }

//    private static boolean isValidPassword(String password) {
//     int lengthOfPassword = 8;
//     int minimumDigit = 2;
//
//
//        boolean validatePassword = isLengthValid(password,lengthOfPassword)&&
//                isOnlyLetterAndDigits(password)&&
//                hasDigits(password,minimumDigit);
//        return validatePassword;
//    }
//
//    private static boolean hasDigits(String password, int digit) {
//    int numberOfDigits = 0;
//        for (int i = 0; i < password.length() ; i++) {
//            if (Character.isDigit(password.charAt(i))){
//                numberOfDigits++;
//            }
//         if (numberOfDigits >= digit){
//             return true;
//         }
//        }
//    return false;
//    }
//    private static boolean isOnlyLetterAndDigits(String password) {
//        for (int i = 0; i < password.length() ; i++) {
//            if (!Character.isLetterOrDigit(password.charAt(i))){
//                return false;
//            }
//        }
//    return true;
//    }
//    private static boolean isLengthValid(String password, int validLength) {
//    return password.length() >= validLength;
//    }
}
