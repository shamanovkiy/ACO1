package homework3;


public class Administrator extends EmployeeSC{
    private ServiceCenter serviceCenter;



    public Administrator(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
        serviceCenter.setClients(new Client[10]);
        serviceCenter.setEquipments(new Equipment[10]);
    }

    public void addClient(Client client, Equipment equipment){
        serviceCenter.addClient(client, equipment);
    }

    public void showClients(){
        serviceCenter.showClients();
    }

    public void takeEquipment(Client client, Equipment equipment){
        serviceCenter.addClient(client, equipment);
    }

    public void giveToRepair(String model, Repairman repairman){
        serviceCenter.giveToRepair(model, repairman);
    }

    public void giveToClient(String nameClient){
        serviceCenter.giveToClient(nameClient);
    }

}
