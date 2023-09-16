package CheckAppStore;

public class Product {
    private int productQuantity;
    private  double productPrice;
    private  String productName;
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String toString(){
        return String.format("""
              
                product name:   %s
                product quantity: %d
                product price: %f
                """,productName,productQuantity,productPrice);
    }



}
