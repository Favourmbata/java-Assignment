package OOPpackage.pizzaRecommendingApp;

public class PizzaPrediction {

    private int numberOfBoxesToGet;
    private int numberOfSlizesRemaining;

    private long totalPrice;
    private int amountOfPizza;

    public void setAmountOfPizza(int amountOfPizza){
        this.amountOfPizza = amountOfPizza;
    }

   public int getAmountOfPizza(){
        return amountOfPizza;
   }

    public int getNumberOfBoxesToGet() {
        return numberOfBoxesToGet;
    }

    public void setNumberOfBoxesToGet(int numberOfBoxesToGet) {
        this.numberOfBoxesToGet = numberOfBoxesToGet;
    }

    public int getNumberOfSlizesRemaining() {
        return numberOfSlizesRemaining;
    }

    public void setNumberOfSlizesRemaining(int numberOfSlizesRemaining) {
        this.numberOfSlizesRemaining = numberOfSlizesRemaining;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
