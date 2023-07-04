package practice;

import java.util.Scanner;

public class distanceBetweenTwonumbers {

private Scanner scanner = new Scanner(System.in);

public void print(String word){
    System.out.println(word);
}
   public int input(){
       int input = scanner.nextInt();
       return input;
   }

    public void cordinatesOfTwoPoint(){

        print("enter x cordinates of first point ");
        int x1 = input();
        print("enter y cordinates second point");
        int y1 = input();

        print("enter x cordinates of second point");
        int x2 = input();
        print("enter y cordinates of second points");
        int y2 = input();

        if(x1 == y1){
            print("The points are locatesd on a line of perpendicular to the x-axix");
        }
   else if (y1 == y2){
       print("The points are located on a line of perpendicular to the y-axis");
        }
        else {
            print("The points are not located to the perpendicular of any axix");
        }

    }

    public static void main(String[] args) {
        distanceBetweenTwonumbers distanceBetweenTwonumbers = new distanceBetweenTwonumbers();
        distanceBetweenTwonumbers.cordinatesOfTwoPoint();





    }




}
