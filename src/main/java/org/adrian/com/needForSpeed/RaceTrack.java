package org.adrian.com.needForSpeed;

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean tryFinishTrack(NeedForSpeed car) {
        int maxUsage = car.batteryPower / car.batteryDrain;
        int maxDistance = car.speed * maxUsage;
        do {
            car.drive();
        } while (car.batteryDrained());
        return (distance <= maxDistance);
    }
}
