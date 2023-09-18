import Chibuzor.PostUtmeDriller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PostUtmeDrillerTest {
    PostUtmeDriller postUtmeDriller;
    @BeforeEach
    void setup() {
        postUtmeDriller = new PostUtmeDriller();
    }



    @Test
    public void testthatPostUtmeCopiesExist(){
        PostUtmeDriller postUtmeDriller = new PostUtmeDriller();
        assertNotNull(postUtmeDriller);
    }
    @Test
    public void testCalculateUtmeCopiesBetweentOneTofour(){
        int price1 =   postUtmeDriller.getPriceOfUtmeCopies(2);
        assertEquals(2000,price1);
    }

  @Test
    public void testThatValidatePriceOfUtmeCopiesBetweenFiveToNine(){
        int price2 = postUtmeDriller.getPriceOfUtmeCopies(9);
        assertEquals(1800,price2);
  }
   @Test
    public void testthatPriceOfUtmeCopiesBetweenTenToTwentyNine(){
        int price3 = postUtmeDriller.getPriceOfUtmeCopies(12);
        assertEquals(1600,price3);
   }

   @Test
    public void testThatPriceOfUtmeCopiesBetweenthirtyToForthDay(){
        int price4 = postUtmeDriller.getPriceOfUtmeCopies(49);
       assertEquals(1500,price4);
    }

@Test
    public void testThatPriceOfUtmeCopiesBetweenfiftyToNintyNine(){
       int price5 = postUtmeDriller.getPriceOfUtmeCopies(80);
      assertEquals(1300,price5);
    }

@Test
    public void testThatCalculatePriceOfUtmeCopiesBetweenHundrenToHundrenAndNintyNine(){
        int price6 = postUtmeDriller.getPriceOfUtmeCopies(199);
       assertEquals(1200,price6);

    }
@Test
    public void testThatCalculatePriceOfUtmeCopiesBetweenTwoHundrendToFourHundredAndNintyNine(){
        int pricePerCopies = postUtmeDriller.getPriceOfUtmeCopies(499);
            assertEquals(1100,pricePerCopies);
    }
   @Test
    public void testThatCalculatesPricePerUtmeCopiesAboveFiveHundrend(){
        int pricePercopies = postUtmeDriller.getPriceOfUtmeCopies(6000);
        assertEquals(1000,pricePercopies );
   }


   @Test
    public void testthatclculatepricePerCopies(){
        int count=0;
         int []no_of_copies = {2, 5, 23,48, 99, 199, 400, 7000, 45 };
         int []price = {2000, 1800, 1600,1500,1300,1200, 1100, 1000, 1500};

         for(int i=0; i<no_of_copies.length; i++){
             if(postUtmeDriller.getPriceOfUtmeCopies(no_of_copies[i]) == price[i]){
                 count++;
             }
         }
         assertEquals(9, count);
   }

}


