package org.adrian.com.carsAssemble;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double percent;
        if (speed == 10) {
            percent = 0.77;
        } else if (speed == 9) {
            percent = 0.8;
        } else if (speed < 9 && speed > 4) {
            percent = 0.9;
        } else if (speed < 5) {
            percent = 1;
        } else {
            percent = 0;
        }
        return 221 * speed * percent;
    }
    public int workingItemsPerMinute(int speed) {
        int maxPerHour = (int) productionRatePerHour(speed);
        return maxPerHour / 60;
    }
}