package repositories;

import models.ParkingSpot;
import models.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot update(ParkingSpot previous) {
        return previous;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type) {
        for (ParkingSpot p: parkingSpots) {
            if (p.getType().equals(type) && !p.isOccupied()) {
                return p;
            }
        }

        return null;
    }
}
