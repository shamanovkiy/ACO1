package homework2.parking;


public class Valet {
    private int count;
    private Parking parking;

    public Valet(Parking parking) {
        this.parking = parking;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addVehicle(Vehicle vehicle) {
        parking.addVehicle(vehicle);
    }

    public void deleteVehicle(Vehicle vehicle) {
        parking.deleteVehicle(vehicle);
    }

    public void doDmg(Vehicle vehicle) {
        for (int i = 0; i < parking.getLength(); i++) {
            if (parking.getParking()[i] == vehicle) {
                parking.getParking()[i].setCondition(false);
            }
        }
    }
}
