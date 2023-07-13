package SalesCommissionCalculator.src;

public class SalesCommissionCalculator {
   private String salesPersonName;
   private final double SALES_PERSON_SALARY = 200.0;
   private final double ITEM_ONE_PRICE = 239.99;
   private final double ITEM_TWO_PRICE = 139.75;
   private final double ITEM_THREE_PRICE = 99.95;
   private final double ITEM_FOUR_PRICE = 350.89;
   private final double COMMISION_RATE = 9.0/100.0;
   private int numberOfItem1Sold;
   private int numberOfItem2Sold;
   private int numberOfItem3Sold;
   private int numberOfItem4Sold;
   private double totalEarning;
   private double grossSale;

   public void calculateGrossSales() {
      double totalSaleForItem1 = numberOfItem1Sold * ITEM_ONE_PRICE;
      double totalSaleForItem2 = numberOfItem2Sold * ITEM_TWO_PRICE;
      double totalSaleForItem3 = numberOfItem3Sold * ITEM_THREE_PRICE;
      double totalSaleForItem4 = numberOfItem4Sold * ITEM_FOUR_PRICE;

      grossSale = totalSaleForItem1 + totalSaleForItem2 + totalSaleForItem3 + totalSaleForItem4;
   }

   public void setSalesPersonName(String salesPersonName) {
    this.salesPersonName = salesPersonName;
   }

   public String getSalesPersonName() {
    return salesPersonName;
   }

   public double getSalesPersonSalary() {
    return SALES_PERSON_SALARY;
   }


   public void setNumberOfItem1Sold(int numberOfItem1) {
      this.numberOfItem1Sold = numberOfItem1;
   }

   public void setNumberOfItem2Sold(int numberOfItem2) {
      this.numberOfItem2Sold = numberOfItem2;
   }

   public void setNumberOfItem3Sold(int numberOfItem3) {
      this.numberOfItem3Sold = numberOfItem3;
   }

   public void setNumberOfItem4Sold(int numberOfItem4) {
      this.numberOfItem4Sold = numberOfItem4;
   }

   public double getGrossSales() {
      return grossSale;
   }
}
