package CheckOutApp;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        this.price = price;
        return price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }

   public String toString(){
        return String.format("%-15s%-10.2f%-10%-10",name,price,quantity,price * quantity);
   }


}
