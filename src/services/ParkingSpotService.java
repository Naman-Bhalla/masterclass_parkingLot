package services;

import models.ParkingSpot;
import repositories.ParkingSpotRepository;

public class ParkingSpotService {
    ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot markSpotBooked(ParkingSpot spot) {
        return parkingSpotRepository.update(spot);
    }
}
