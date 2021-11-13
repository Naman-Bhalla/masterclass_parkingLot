package services;

import models.ParkingSpot;
import models.VehicleType;
import repositories.ParkingSpotRepository;

public class SlotAllocationService {
    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSlot(VehicleType type) {
        ParkingSpot availableSpot = parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(type);
        return availableSpot;
    }
}
