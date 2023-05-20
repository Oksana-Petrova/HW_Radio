package ru.netology.domain;

public class Radio {
    private int countOfStation = 10;
    private int maxStation;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio () {
        maxStation = countOfStation - 1;
    }

    public Radio(int countOfStation) {
        this.countOfStation = countOfStation;
        maxStation = countOfStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    //метод выставления радиостанции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //метод перехода на следующую станцию
    public void next() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    //метод перехода на предыдущую станцию
    public void prev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //метод увеличения громкости на 1
    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //метод уменьшения громкости на 1
    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}