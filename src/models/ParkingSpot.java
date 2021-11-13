package models;

public class ParkingSpot extends BaseModel {
    VehicleType type;
    boolean isOccupied;
    String name; // 1A, 1B, 1C, 2A
}

// SRP -> every code unit: file, class, method should have exactly 1 responsibility
// ORM will do this for us
// ParkingLot -˘ CRUD creteParkibngLot()
// addParkingFloor()
// addParkingSpot()