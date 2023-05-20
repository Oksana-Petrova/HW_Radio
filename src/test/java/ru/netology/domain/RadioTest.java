package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation100() {
        radio.setCurrentStation(100);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStation0() {
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAbove9() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationUnder0() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextRadioStation() {
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextRadioStationAbove9() {
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePrevRadioStation() {
        radio.setCurrentStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextRadioStationUnder0() {
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolume() {
        radio.setCurrentVolume(64);

        int expected = 64;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeAbove100() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioVolumeUnder0() {
        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIncreaseVolume() {
        radio.setCurrentVolume(66);

        radio.increaseVolume();

        int expected = 67;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeIncreaseVolumeAboveMax() {
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeDecreaseVolume() {
        radio.setCurrentVolume(4);

        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeDecreaseVolumeUnderMin() {
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCountOfStation() {
        Radio radio = new Radio(23);

        Assertions.assertEquals(22, radio.getMaxStation());
    }
}