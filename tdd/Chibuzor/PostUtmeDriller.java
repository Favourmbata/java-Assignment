package Chibuzor;

public class PostUtmeDriller {

    public int getPriceOfUtmeCopies(int numberOfCopies) {

         int result;
          if (numberOfCopies >= 1 && numberOfCopies <= 4){
             result = 2000;
         } else if (numberOfCopies >= 5 && numberOfCopies <= 9) {
              result = 1800;
          } else if (numberOfCopies >= 10 && numberOfCopies <= 29) {
              result = 1600;
          } else if (numberOfCopies >=30  && numberOfCopies <= 49) {
            result = 1500;
          } else if (numberOfCopies >= 50 && numberOfCopies <= 99) {
              result = 1300;
          } else if (numberOfCopies >= 100 && numberOfCopies <= 199) {
              result = 1200;
          } else if (numberOfCopies >=200 && numberOfCopies <= 499) {
              result = 1100;
          }else {
              result = 1000;

        }
         return result;
    }
}
