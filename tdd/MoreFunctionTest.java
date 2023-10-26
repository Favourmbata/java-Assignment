import Chibuzor.MoreFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MoreFunctionTest {
    @Test
    public void testForEvenAndOddInteger(){
        MoreFunction instance = new MoreFunction();
        assertEquals(false, instance.isEvenNumber(7));
    }

   @Test
    public void testThatANumberIsPrime(){
        MoreFunction instance = new MoreFunction();
        assertEquals(true,instance.primeNumber(10));
   }
   @Test
    public void testForFactorsOfNumber(){
        MoreFunction instance = new MoreFunction();
        assertEquals(4,instance.factorsOfNumber(10));
   }

    @Test
    public void testSquaresOfNumber(){
        MoreFunction instance =  new MoreFunction();
        assertEquals(true,instance.squaresOfNumbers(20));
    }

   @Test
    public void testForFactorialsOfNumbers(){
        MoreFunction instance = new MoreFunction();
        assertEquals(24,instance.factorialOfNumber(4));
   }
   @Test
    public void testThatANumberIsPalindrome(){
        MoreFunction instance = new MoreFunction();
        assertEquals(true,instance.isPalindrome(89706));
   }
  @Test
    void testthatSwapsNumbers(){
        MoreFunction moreFunction = new MoreFunction();
        int []numbers = {1,2,3,4,5};
        int []result = moreFunction.Swap(numbers);
        int [] expected = {3,4,1,2,5};
        assertArrayEquals(expected,result);

  }

      @Test
       void testThatSwapPosition(){
       MoreFunction moreFunction = new MoreFunction();
       int [] numbers = {1,2,3,4,5};
       int [] expected = {3,2,1,4,5};
       assertArrayEquals(expected,moreFunction.getSwappedPosition(numbers,1,2));


       }


    public static class Mp3PlayerTest {

        @Test
        public  void testThatMp3PlayerIsOn(){
           Mp3Player mp3Player = new Mp3Player();
           mp3Player.turnOn();
            assertTrue(mp3Player.checkPowerMode());
        }

            @Test
            public void testThatMp3PlayerISOff(){
            Mp3Player mp3Player = new Mp3Player();
           mp3Player.turnOn();
           assertTrue(mp3Player.checkPowerMode());
           mp3Player.turnOff();
           assertFalse(mp3Player.checkPowerMode());
            }
        @Test
        public void testThatMp3PlayerCanNextSong1(){
            Mp3Player mp3Player = new Mp3Player();
            mp3Player.turnOn();
            assertTrue(mp3Player.checkPowerMode());
            mp3Player.turnOff();
            assertFalse(mp3Player.checkPowerMode());
            mp3Player.nextSong();
            mp3Player.nextSong();
            mp3Player.nextSong();
            mp3Player.nextSong();
            assertEquals("i'm playing song -> 4", mp3Player.checkCurrentSong());
        }
        @Test
        public void testThatMp3PlayerCanPlayPreviousSong(){
            Mp3Player mp3Player = new Mp3Player();
            mp3Player.turnOn();
           assertTrue(mp3Player.checkPowerMode());
            mp3Player.turnOff();
            assertFalse(mp3Player.checkPowerMode());
            mp3Player.nextSong();
            mp3Player.nextSong();
            mp3Player.nextSong();
            mp3Player.nextSong();
            assertEquals("i'm playing song -> 4",mp3Player.checkCurrentSong());
             mp3Player.playPreviousSong();
             mp3Player.playPreviousSong();
             assertEquals("i'm playing song -> 2",mp3Player.checkCurrentSong());

        }
        @Test
        public void testThatMp3CanIncreaseVolume(){
            Mp3Player mp3Player = new Mp3Player();
            mp3Player.turnOn();
            mp3Player.increseVolume();
            assertEquals(5,mp3Player.checkVolume());
        }

        @Test
        public void testThatMp3CanDecreaseVolume(){
            Mp3Player mp3Player = new Mp3Player();
            mp3Player.turnOn();
            mp3Player.increseVolume();
            mp3Player.decreaseVolume();
            assertEquals(0, mp3Player.checkVolume());
        }

        @Test
        public void testThatMp3CanPauseSong(){
            Mp3Player mp3Player = new Mp3Player();
            mp3Player.turnOn();
            mp3Player.nextSong();
            mp3Player.pauseSong();
            mp3Player.playSong();
            assertEquals(true,mp3Player.checkPlaySong());
        }


    }
}
