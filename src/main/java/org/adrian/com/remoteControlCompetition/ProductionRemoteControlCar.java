package org.adrian.com.remoteControlCompetition;

import lombok.Getter;
import lombok.Setter;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distanceDriven = 0;
    @Getter
    @Setter
    int numbersOfVictories = 0;

    @Override
    public void drive() {
        distanceDriven += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numbersOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return 0;
    }
}