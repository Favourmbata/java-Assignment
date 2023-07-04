package chapter3;

public class PetrolPurchase {
    private String location;
    private int petrolQuantity;
    private String petrolType;
    private double pricePerLiter;
    private double petrolPercentageDiscount;

    public void setLocation(String stationLocation) {
        this.location = stationLocation;
    }

    public String getLocation() {
        return location;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolQuantity(int petrolQuantity) {
        this.petrolQuantity = petrolQuantity;
    }

    public int getPetrolQuantity() {
        return petrolQuantity;
    }


    public void setpricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }


    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPetrolPercentageDiscount(double petrolPercentageDiscount) {
        this.petrolPercentageDiscount = petrolPercentageDiscount;
    }

    public double getPetrolPercentageDiscount() {
        return petrolPercentageDiscount;
    }

    public double getPurchaseAmount(int petrolQuantity, double pricePerLiter, double petrolPercentageDiscount) {
        double netPurchaseAmount = petrolQuantity  * pricePerLiter - petrolPercentageDiscount;
        return netPurchaseAmount;
    }

}