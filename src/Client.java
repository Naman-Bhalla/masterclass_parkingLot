import controllers.EntryGateController;
import models.Vehicle;

public class Client {
    public static void main(String[] args) {
        EntryGateController entryGateController = new EntryGateController();
        Vehicle vehicle = new Vehicle();

        entryGateController.getTicket(vehicle);
    }
}
