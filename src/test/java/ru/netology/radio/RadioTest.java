package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNextNumber() {
        Radio number = new Radio();
        number.setNextNumber(8);

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAboveMax() {
        Radio number = new Radio();
        number.setNextNumber(9);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumber() {
        Radio number = new Radio();
        number.setCurrentNumber(9);

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentNumberAboveMax() {
        Radio number = new Radio();
        number.setCurrentNumber(10);

        int expected = 0;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void shouldPrevNumber() {
        Radio number = new Radio();
        number.setPrevNumber(5);

        int expected = 4;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevNumberBelowMin() {
        Radio number = new Radio();
        number.setPrevNumber(0);

        int expected = 9;
        int actual = number.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolume() {
        Radio volume = new Radio();
        volume.setNextVolume(99);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setNextVolume(100);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolume() {
        Radio volume = new Radio();
        volume.setPrevVolume(100);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevVolumeBelowMin() {
        Radio volume = new Radio();
        volume.setPrevVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCurrentVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCurrentVolumeAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
