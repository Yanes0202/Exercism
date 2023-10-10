package org.adrian.com.remoteControlCompetition;

import java.util.Comparator;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> unsortedCars) {
        return unsortedCars.stream()
                .sorted(Comparator.comparingInt(ProductionRemoteControlCar::getNumbersOfVictories).reversed())
                .toList();
    }
}
