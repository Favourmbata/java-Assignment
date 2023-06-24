import org.junit.Test;

import static org.junit.Assert.*;

public class Mp3PlayerTest {

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
