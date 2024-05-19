package ru.netology.radio;

public class Radio {

    public int currentNumber;
    public int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumber(int newCurrentNumber) {

        if (newCurrentNumber > 9) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void setNextNumber(int newCurrentNumber) {
        if (newCurrentNumber < 9) {
            newCurrentNumber = newCurrentNumber + 1;
        } else {
            newCurrentNumber = 0;

        }
        currentNumber = newCurrentNumber;
    }

    public void setPrevNumber(int newCurrentNumber) {
        if (newCurrentNumber > 0) {
            newCurrentNumber = newCurrentNumber - 1;
        } else {
            newCurrentNumber = 9;
        }
        currentNumber = newCurrentNumber;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setNextVolume(int newCurrentVolume) {
        if (newCurrentVolume < 100) {
            newCurrentVolume = newCurrentVolume + 1;
        } else {
            newCurrentVolume = 0;

        }
        currentVolume = newCurrentVolume;
    }

    public void setPrevVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume = newCurrentVolume - 1;
        } else {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }
}