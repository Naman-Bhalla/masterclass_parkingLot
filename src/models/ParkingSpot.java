package models;

public class ParkingSpot extends BaseModel {
    VehicleType type;
    boolean isOccupied;
    String name; // 1A, 1B, 1C, 2A

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// SRP -> every code unit: file, class, method should have exactly 1 responsibility
// ORM will do this for us
// ParkingLot -˘ CRUD creteParkibngLot()
// addParkingFloor()
// addParkingSpot()