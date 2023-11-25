package Chapter8.Food;

public class FoodMain {

    public static Food goat(Food food){
        return food;
    }
    public static void main(String[] args) {
    for (Food food :Food.values()){
        System.out.println("food: " + food.name());
        System.out.println("food: " + food.getType());
        System.out.println("food: " + food.calorories());
        System.out.println();
    }

    }
}
