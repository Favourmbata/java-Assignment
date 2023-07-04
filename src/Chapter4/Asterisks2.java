package Chapter4;

public class Asterisks2 {
    int number = 10;
    public void woLoopWorkingTogther() {
      for (int i = number; i > 0; i--) {
          for (int j = i; j < 10; j++) {
              System.out.print("#");
          } for (int j = 0; j < i; j++) {
              System.out.print(" ");}
              for (int j = i; j > 0; j--) {
                  System.out.print("#");
              }
          System.out.println();

  }



      }


    public static void main(String[] args) {
        Asterisks2 asterisks2 = new Asterisks2();
        asterisks2.woLoopWorkingTogther();


//
//    Asterisks2 asterisks21 = new Asterisks2();
//    asterisks2.Asterisk2sPattern();


  }


}








