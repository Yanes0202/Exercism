package org.adrian.com.remoteControlCompetition;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> unsortedCars) {
        return unsortedCars.stream()
                .sorted(Comparator.comparingInt(ProductionRemoteControlCar::getNumbersOfVictories).reversed())
                .collect(Collectors.toList());
    }
}
