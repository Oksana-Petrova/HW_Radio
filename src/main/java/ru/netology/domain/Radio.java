package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //метод выставления радиостанции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //метод перехода на следующую станцию
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    //метод перехода на предыдущую станцию
    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    //метод увеличения громкости на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    //метод уменьшения громкости на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}