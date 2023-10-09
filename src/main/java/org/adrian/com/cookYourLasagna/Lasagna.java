package org.adrian.com.cookYourLasagna;

public class Lasagna {
    protected int expectedMinutes = 40;
    public int expectedMinutesInOven() {
        return expectedMinutes;
    }
    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutes - minutesInOven;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        int timeForLayers = layers * 2;
        return minutesInOven + timeForLayers;
    }
}
