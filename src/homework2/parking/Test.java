package homework2.parking;


public class Test {
    public static void main(String[] args) {

        Vehicle my1 = new Vehicle( "AUDI", "A6", "RED", 2012, true);
        Vehicle my2 = new Vehicle( "BMW", "M3", "WHITE", 2008, true);
        Vehicle my3 = new Moto( "DUCATI", "899 PANIGAL", "RED", 2015, true);
        Vehicle my4 = new Vehicle( "DODGE", "CHALLENGER", "BLACK", 1980, false);
        Vehicle my5 = new Vehicle( "PORSCHE", "CARERRA GT", "YELLOW", 2013, true);

        my1.drive();
        my3.drive();
        my4.drive();

        Parking parking = new Parking(10);
        Valet valet = new Valet(parking);
        valet.addVehicle(my1);
        valet.addVehicle(my2);
        valet.addVehicle(my3);
        valet.addVehicle(my4);
        valet.addVehicle(my5);

        System.out.println(parking.freePlaces());

        parking.showAll();

        System.out.println();

        System.out.println();
        parking.showMoto();

        parking.work(true);

        System.out.println();
        valet.deleteVehicle(my3);
        parking.showAll();

        System.out.println();
        valet.doDmg(my1);
        parking.getParking()[0].drive();








    }
}
