import SalesCommissionCalculator.src.SalesCommissionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SalesCommissionCalculatorTest {

    @Test
    public void testThatSalesPersonReceives200DollarsWeekly(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        salesCommissionCalculator.setSalesPersonName("SalesPerson1");
        assertEquals("SalesPerson1", salesCommissionCalculator.getSalesPersonName());
        assertEquals(200.00, salesCommissionCalculator.getSalesPersonSalary());
    }

    @Test void calculateGrossSalesTest(){
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        salesCommissionCalculator.setSalesPersonName("SalesPerson1");
        salesCommissionCalculator.setNumberOfItem1Sold(2);
        salesCommissionCalculator.setNumberOfItem2Sold(5);
        salesCommissionCalculator.setNumberOfItem3Sold(3);
        salesCommissionCalculator.setNumberOfItem4Sold(4);

        salesCommissionCalculator.calculateGrossSales();
        assertEquals(2882.14, salesCommissionCalculator.getGrossSales());
    }

    @Test
    public void testThatEachSalesPersonReceivesACommissionOfNinePercentOfTheirGrossSales(){

    }

    @Test void calculateTotalEarningsTest(){

    }

    @Test void testThatUsernameHasToBeSetBeforeTheyCanCalculateGrossSaleOrCalculateTotalEarnings(){

    }

}
