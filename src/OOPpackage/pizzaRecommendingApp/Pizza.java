package OOPpackage.pizzaRecommendingApp;

public class Pizza {

    private String pizzaSize;
    private  int PizzaSlizes;
     private  int pizzaSizePrice;

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }
    public int getPizzaSlizes() {
        return PizzaSlizes;
    }

    public void setPizzaSlizes(int pizzaSlizes) {
        PizzaSlizes = pizzaSlizes;
    }
    public int getPizzaSizePrice() {
        return pizzaSizePrice;
    }

    public void setPizzaSizePrice(int pizzaSizePrice) {
        this.pizzaSizePrice = pizzaSizePrice;
    }

}
