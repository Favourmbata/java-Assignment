package MobibleNetwork;

import java.util.Scanner;

public class MobileNetwork {
          Scanner console = new Scanner(System.in);

              String[] airtel = {"0708", "0802", "0902", "0812", "0701"};
               String[] mtn = {"0803", "0816", "0903", "0810", "0806", "0703", "0706", "0813", "0814", "0906", "0903", "07025", "07026"};
               String[] glo = {"0905", "0807", "0811", "0705", "0815", "0805"};

               String[] etisalat = {"0802", "0812", "0808", "0708", "0701", "0902", "0901", "0907"};


        public String providefourDigit(String phoneNumber){
         return phoneNumber.substring(0,4);

        }

      public boolean checkAirtel(String phoneNumber){
         String firstFour = providefourDigit(phoneNumber);

//         checkIf firstNumber Exist in an array

         for (int i = 0; i < airtel.length; i++) {
                if (firstFour.equals(airtel[i])){
                     return true;
                }
           }
         return  false;

        }
       public boolean checkMtn(String phoneNumber){
            String firstfourDigit = providefourDigit(phoneNumber);
             for (int i = 0; i < mtn.length ; i++) {
                 if (firstfourDigit.equals(mtn[i])){
                      return true;
                 }
            }
        return false;
        }
       public boolean checkEtisalat(String phoneNumber){
             String firstFour = providefourDigit(phoneNumber);

            for (int i = 0;  i < etisalat.length ; i++) {
                 if (firstFour.equals(etisalat[i])){
                      return true;
            }

            }
          return false;
        }


      public boolean checkGlo(String phoneNumber){
             String firstFour = providefourDigit(phoneNumber);

           for (int i = 0; i < glo.length ; i++) {
                if (firstFour.equals(glo[i])){
                     return true;
                }
           }
        return false;
        }

}