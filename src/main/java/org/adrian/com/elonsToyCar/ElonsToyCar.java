package org.adrian.com.elonsToyCar;

public class ElonsToyCar {
    private int meters;
    private int battery = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }
    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        } else
            return "Battery at " + battery + "%";
    }
    public void drive() {
        if (battery != 0) {
            meters = meters + 20;
            battery--;
        }
    }
}