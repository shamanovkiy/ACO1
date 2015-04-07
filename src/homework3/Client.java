package homework3;


public class Client {

    private String name;
    private Equipment equipment;


    public Client(String name, Equipment equipment){
        this.name = name;
        this.equipment = equipment;
    }

    public void takeEquipment(Equipment equipment){
        this.equipment = equipment;
    }

    public Equipment giveEquipment(Equipment equipment){
        return equipment;
    }

    @Override
    public String toString() {
        return String.format("Name - %s, item - %s", name, equipment.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (name != null ? !name.equals(client.name) : client.name != null) return false;
        return true;
    }

}
