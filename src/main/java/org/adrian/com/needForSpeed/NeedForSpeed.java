package org.adrian.com.needForSpeed;

class NeedForSpeed {
    int speed;
    int batteryDrain;
    int batteryPower = 100;
    int driven = 0;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        return batteryPower <= 0;
    }
    public int distanceDriven() {
        return driven;
    }
    public void drive() {
        if (!batteryDrained()) {
            batteryPower -= batteryDrain;
            driven += speed;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

