package Chapter5;

import java.util.Scanner;

public class TwelveDayOfChristmax {

    Scanner scanner = new Scanner(System.in);

  public void daysOfChristmax(){

      System.out.println("""
              Christmax present to my true love
              press 1 for christmax song
              press 0 to quit
              
              """);
      int day = scanner.nextInt();
      if (day == 1){
          christmaxSong();
      }
     if (day == 0){
         System.out.println("suprised!!!");
     }

  }
    public void christmaxSong(){
          System.out.println("""
                press 1 to print the first day of christmax
                press 2 to print the second day of christmax
                press 3 to print the third day of christmax:
                press 4 to print the fourth day of christmax:
                press 5 to print the fifth day of christmax:
                press 6 to print the sixth day of christmax:
                press 7 to print the seventh day of christmax:
                 press 8 to print th eighth day of christmax:
                press 9 to print the nineth day of christmax:
                press 10 to print the tenth day of christmax: 
                press 11 to print the eleventh day of christmax:
                press 12 to print the twelveth day of christmax:
                press 0 to quit
                """);
           int  day = scanner.nextInt();
         switch (day){

             case 1:
             apatridgeInApearTree();
          break;
             case 2:
                 twoTurtleDove();
                 break;
             case 3:
            threeFrenchHens();
                 break;
             case 4:
                fourCallingBirds();
                break;
             case 5:
                 fiveGoldenRings();
             case 6:
                 sixGeeseALaying();
                 break;
             case 7:
                 sevenSwamASwimming();
             break;
                 case 8:
                 eightMaidAMilking();
             break;
                 case 9:
                 nineLadiesDancing();
                     break;
             case 10:
                 tenLordsALeaping();
                 break;
             case 11:
                 elevenPipersPiping();
                 break;
             case 12:
                 twelveDrummersDrumming();
                 break;
             default:
                 christmaxSong();

         }
    }
  public void apatridgeInApearTree(){
      System.out.println("""
              on the first day of christimax
              my true love gave to me:
              1.=> A patridge in a pear Tree
              """);
      int day = scanner.nextInt();
      if (day == 1){
          christmaxSong();
      }

  }
 public void twoTurtleDove(){
     System.out.println("""
             on the second day of christmax,
             my true love gave to me:
             2.=> Two Turtle Dove
             And a patridge in a pear tree
             
             """);
      int day = scanner.nextInt();
      if (day == 2){
          twoTurtleDove();
      }

 }
 public void threeFrenchHens(){
     System.out.println("""
             on the third day of christmax,
             my true love gave to me:
             3.=> Three French Hens
             2.=> Two Turtle Dove
             And a patridge in a pear tree
             """);
     int day = scanner.nextInt();

 }

   public void fourCallingBirds(){
       System.out.println("""
               on the fourth day of christmax,
               my true love gave to me:
               4.=> Four Calling Birds
               3.=> Three french hens
               2.=> Two turtle Dove
               And a patridge in a pear tree
               """);
       int day = scanner.nextInt();

   }
   public void fiveGoldenRings(){
       System.out.println("""
               on the fifth day of christmax,
               my true love gave to me:
               5.=> Five Golden Rings
               4.=> Four Calling Birds
               3.=> Three french hens
               2.=> Two turtle Dove
               And a patridge in a pear tree
               """);
       int day = scanner.nextInt();

   }
    public void sixGeeseALaying(){
        System.out.println("""
               on the sixth day of christmax,
               my true love gave to me:
               6.=> Six Geese A laying
               5.=> Five Golden Rings
               4.=> Four Calling Birds
               3.=> Three french hens
               2.=> Two turtle Dove
               And a patridge in a pear tree
                """);
    }
  public void sevenSwamASwimming(){
      System.out.println("""
              on the seventh day of christmax,
              my true love gave to me:
              7.=> Seven Swams a- Swimming
              6.=> Six Geese A laying
              5.=> Five Golden Rings
              4.=> Four Calling Birds
              3.=> Three french hens
              2.=> Two turtle Dove
              And a patridge in a pear tree
              
              """);
  }
  public void eightMaidAMilking(){
      System.out.println("""
              on the seventh day of christmax,
              my true love gave to me:
              8.=> Eight Maid A Milking
              7.=> Seven Swams a- Swimming
              6.=> Six Geese A laying
              5.=> Five Golden Rings
              4.=> Four Calling Birds
              3.=> Three french hens
              2.=> Two turtle Dove
              And a patridge in a pear tree
              
              """);
  }

  public void nineLadiesDancing(){
      System.out.println("""
              on the seventh day of christmax,
              my true love gave to me:
              9.=> Nine Ladies Dancing
              8.=> Eight Maid A Milking
              7.=> Seven Swams a- Swimming
              6.=> Six Geese A laying
              5.=> Five Golden Rings
              4.=> Four Calling Birds
              3.=> Three french hens
              2.=> Two turtle Dove
              And a patridge in a pear tree
              
              """);
  }
 public void tenLordsALeaping(){
     System.out.println("""
             on the seventh day of christmax,
             my true love gave to me:
             10.=> Ten lords A Leaping
             9.=> Nine Ladies Dancing
             8.=> Eight Maid A Milking
             7.=> Seven Swams a- Swimming
             6.=> Six Geese A laying
             5.=> Five Golden Rings
             4.=> Four Calling Birds
             3.=> Three french hens
             2.=> Two turtle Dove
             And a patridge in a pear tree
             
             """);
 }

  public void elevenPipersPiping(){
      System.out.println("""
             11.=> Eleven pipers piping
             10.=> Ten lords A Leaping
             9.=> Nine Ladies Dancing
             8.=> Eight Maid A Milking
             7.=> Seven Swams a- Swimming
             6.=> Six Geese A laying
             5.=> Five Golden Rings
             4.=> Four Calling Birds
             3.=> Three french hens
             2.=> Two turtle Dove
             And a patridge in a pear tree
              """);
  }
 public void twelveDrummersDrumming(){
     System.out.println("""
             12.=>Twelve Drummers Drumming
             11.=> Eleven pipers piping
             10.=> Ten lords A Leaping
             9.=> Nine Ladies Dancing
             8.=> Eight Maid A Milking
             7.=> Seven Swams a- Swimming
             6.=> Six Geese A laying
             5.=> Five Golden Rings
             4.=> Four Calling Birds
             3.=> Three french hens
             2.=> Two turtle Dove
             And a patridge in a pear tree
             
             """);
 }


    public static void main(String[] args) {
        TwelveDayOfChristmax  twelveDayOfChristmax = new TwelveDayOfChristmax();
        twelveDayOfChristmax.daysOfChristmax();
    }

 }








