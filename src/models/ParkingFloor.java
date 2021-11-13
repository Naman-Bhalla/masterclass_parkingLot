package models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    int floor_no;
    String name;
    List<ParkingSpot> parkingSpotList;
}
