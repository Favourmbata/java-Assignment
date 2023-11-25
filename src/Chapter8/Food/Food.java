package Chapter8.Food;
//8.10 Write an enum type Food, whose constants (APPLE, BANANA, CARROT) take two parameters
//       the type (vegetable or fruit), and number of calories. Write a program to test the Food enum
//so that it displays the enum names and their information.
public enum Food {
    APPLE ("fruit",52),
    BANANA("fruit",89),
    CARROT("vegetable",41);


   private String type;
    private  int calories;

    Food(String type, int calories) {

    }

   public String getType(){

       return type;
   }
   public int calorories(){

       return calories;
   }
}
