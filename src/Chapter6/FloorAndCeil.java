package Chapter6;

public class FloorAndCeil {
    public static int myFloor(double num) {
      if (num >= 0){
          return (int) num;
      }else {
          int floor = (int)num;
          return (num == floor)?floor : floor -1;
      }

    }
      public  static int  myCeil(double num){
        if (num >= 0){
            int ceil = (int) num;
            return (num == ceil)? ceil : ceil + 1;
        }else {
            return (int) num;
        }
      }

    public static void main(String[] args) {
        double num = 10.6;
        int floorResult = myFloor(num);
        int ceilResult = myCeil(num);

        System.out.println("Original number is:" + num );
        System.out.println("My floor value is: " + floorResult);
        System.out.println("my ceil result is:" + ceilResult);
    }

}
