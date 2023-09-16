package CheckAppStore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public List<Product> getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(List<Product> listOfProduct) {
        this.listOfProduct = listOfProduct;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Product> listOfProduct = new ArrayList<>();

    public String addProduct(Product product){
    listOfProduct.add(product);
    return String.format("product added successfully");



    }
}
