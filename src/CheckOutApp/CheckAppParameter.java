package CheckOutApp;

public class CheckAppParameter {
    private  String customerName;
//    private int itemPurchase;
    private String itemPurchased;
    private  int numberOfItems;
    private  int price;
    private double discount;
//    private double amountPaid;
    private boolean again;

    public double getAmountPaid() {
        return price * numberOfItems;
    }
//
//    public void setAmountPaid(double amountPaid) {
//        this.amountPaid = amountPaid;
//    }

    public boolean getIsAgain() {
        return again;
    }

    public void setAgain(boolean again) {
        this.again = again;
    }

    public String getItemPurchase() {
        return itemPurchased;
    }

    public void setItemPurchase(String itemPurchased) {
        this.itemPurchased = itemPurchased;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    public double getDiscount() {
//        return discount;
//    }
//
//    public void setDiscount(double discount) {
//        this.discount = discount;
//    }
}
