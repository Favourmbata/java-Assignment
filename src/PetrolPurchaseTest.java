import chapter3.PetrolPurchase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PetrolPurchaseTest {

    @Test
    public void testThatPetrolHasLocation() {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
    }

    @Test
    public void testThatPetrolHasType() {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("kerosene");
        assertEquals("kerosene", petrolPurchase.getPetrolType());
    }

    @Test
    public void testThatPetrolHasQuality() {
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("kerosene");
        assertEquals("kerosene", petrolPurchase.getPetrolType());
        petrolPurchase.setPetrolQuantity(2);
        assertEquals(2, petrolPurchase.getPetrolQuantity());

    }
    @Test
    public void testThatPetrolHasPricePerliter(){
       PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("kerosene");
        assertEquals("kerosene", petrolPurchase.getPetrolType());
        petrolPurchase.setPetrolQuantity(2);
        assertEquals(2, petrolPurchase.getPetrolQuantity());
        petrolPurchase.setpricePerLiter(1000);
        assertEquals(1000,petrolPurchase.getPricePerLiter(),1000);
    }
    @Test
    public void testThatPetrolHasPercentageDiscount(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("kerosene");
        assertEquals("kerosene", petrolPurchase.getPetrolType());
        petrolPurchase.setPetrolQuantity(2);
        assertEquals(2, petrolPurchase.getPetrolQuantity());
        petrolPurchase.setpricePerLiter(1000);
        assertEquals(1000,petrolPurchase.getPricePerLiter(),1000);
        petrolPurchase.setPetrolPercentageDiscount(00.10);
        assertEquals(00.10,petrolPurchase.getPetrolPercentageDiscount(),00.10);
    }

    @Test
    public void testThatCalculateNetPurchaseAmout(){
        PetrolPurchase petrolPurchase = new PetrolPurchase();
        petrolPurchase.setLocation("sabo");
        assertEquals("sabo", petrolPurchase.getLocation());
        petrolPurchase.setPetrolType("kerosene");
        assertEquals("kerosene", petrolPurchase.getPetrolType());
        petrolPurchase.setPetrolQuantity(2);
        assertEquals(2, petrolPurchase.getPetrolQuantity());
        petrolPurchase.setpricePerLiter(1000);
        assertEquals(1000,petrolPurchase.getPricePerLiter(),1000);
        petrolPurchase.setPetrolPercentageDiscount(00.10);
        assertEquals(00.10,petrolPurchase.getPetrolPercentageDiscount(),00.10);
       assertEquals(1999.9, petrolPurchase.getPurchaseAmount(2,1000,0.10),1999.9);

    }




    }


