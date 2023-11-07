package Class;

import OOPpackage.pizzaRecommendingApp.PizzaRecommendingApp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaRecommendingAppTest {
    @Test

    public void testForLargePizzaBox() {
        PizzaRecommendingApp pizzaRecommendingApp = new PizzaRecommendingApp();
        assertEquals(5000,pizzaRecommendingApp.largePizzaBox().getPizzaSizePrice());
        assertEquals(10,pizzaRecommendingApp.largePizzaBox().getPizzaSlizes());
    }
    @Test
    public void testForMediumPizzaBox() {
        PizzaRecommendingApp pizzaRecommendingApp = new PizzaRecommendingApp();
        assertEquals(3000,pizzaRecommendingApp.mediumPizzaBox().getPizzaSizePrice());
        assertEquals(6,pizzaRecommendingApp.mediumPizzaBox().getPizzaSlizes());
    }

      @Test
    public void testForSmallPizzaBox(){
          PizzaRecommendingApp pizzaRecommendingApp = new PizzaRecommendingApp();
          assertEquals(1200,pizzaRecommendingApp.smallPizzaBox().getPizzaSizePrice());
          assertEquals(2,pizzaRecommendingApp.smallPizzaBox().getPizzaSlizes());
      }


//      @Test
//    public void testForCategoryofPeople(){
//          PizzaRecommendingApp pizzaRecommendingApp = new PizzaRecommendingApp();
//          assertEquals("numberOfPeople",pizzaRecommendingApp.mediumPizzaBox());
//      }

}