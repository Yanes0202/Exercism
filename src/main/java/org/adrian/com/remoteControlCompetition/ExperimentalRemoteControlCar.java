package org.adrian.com.remoteControlCompetition;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceDriven = 0;

    @Override
    public void drive() {
        distanceDriven += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceDriven;
    }
}
