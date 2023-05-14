package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.currentStation = 5;

        int expected = 5;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolime() {
        Radio radio = new Radio();

        radio.volume = 54;

        int expected = 54;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

}
