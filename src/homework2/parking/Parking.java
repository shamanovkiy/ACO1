package homework2.parking;


public class Parking {
    private int length;
    private int count;
    private Vehicle[] parking = new Vehicle[length];

    public Vehicle[] getParking() {
        return parking;
    }

    public void setParking(Vehicle[] parking) {
        this.parking = parking;
    }

    public Parking(int length){
        this.length = length;
        Vehicle[] parking = new Vehicle[length];
        setParking(parking);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public int freePlaces(){
        int freePlaces = 0;
        for (int i = 0; i < length; i++) {
            if(parking[i] == null){
                freePlaces++;
            }
        }
        return freePlaces;
    }

    public void addVehicle(Vehicle vehicle){
        if (count < parking.length) {
            parking[count] = vehicle;
            count++;
        }
    }

    public void deleteVehicle(Vehicle vehicle){
        for (int i = 0; i < length; i++) {
            if(parking[i] == vehicle){
                parking[i] = null;
            }
        }
    }

    public void showInfo(int numOfPlace){
        if(parking[numOfPlace] == null){
            System.out.println("This place is free");
        }
        else{
            System.out.println(parking[numOfPlace].toString());;
        }
    }

    public void showAll(){
        for (int i = 0; i < length; i++) {
            if(parking[i] == null){
            }
            else{
                System.out.println(parking[i].toString());;
            }
        }
    }

    public void showMoto(){
        for (int i = 0; i < length; i++) {
            if(parking[i] == null){
                i++;
            }
            else if(parking[i].getClass() == Moto.class){
                System.out.println(parking[i].toString());
            }
        }
    }

    public void work(boolean working){
        if(working){
            System.out.println("Parking is working");
        }
        else{
            System.out.println("Parking closed");
        }
    }




}
