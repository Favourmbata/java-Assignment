package MenstralApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstralWahalaTest {
      private MenstralWahala menstralWahala;

      @BeforeEach
    public void setUp(){
          menstralWahala = new MenstralWahala("2023-03-03",26,4);
      }
      @Test
    public void testThatPatientCangetOvulationPeriod(){
          String ovulationDate = menstralWahala.getOvulationDay();
          assertEquals("2023-03-18",ovulationDate);
      }
}
   