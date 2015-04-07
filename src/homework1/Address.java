package homework1;


public class Address {
    private String city;
    private String street;
    private String building;

    public Address(){
    }

    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", city, street, building);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
