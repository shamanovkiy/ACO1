package homework3;


import homework1.Address;



public class ServiceCenter {

    private Address address;
    private EmployeeSC[] employees;
    private int index;
    private double income = 10000;
    private String name;
    private Client[] clients = new Client[20];
    private Equipment[] equipments = new Equipment[20];
    private int indexClient;
    private Repairman repairman;

    public void giveToRepair(String model, Repairman repairman){
        for (int i = 0; i < indexClient; i++) {
            if(equipments[i].getModel().equalsIgnoreCase(model))
                repairman.takeEquipment(equipments[i]);
        }
    }

    public Client[] getClients() {
        return clients;
    }

    public boolean giveToClient(String nameClient){
        for (int i = 0; i < indexClient; i++) {
            if(clients[i].equals(nameClient) && equipments[i].isCondition()){
                clients[i].takeEquipment(equipments[i]);
                indexClient--;
                return true;
            }
        }
        return false;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Equipment[] getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipment[] equipments) {
        this.equipments = equipments;
    }

    public int getIndexClient() {
        return indexClient;
    }

    public void setIndexClient(int indexClient) {
        this.indexClient = indexClient;
    }

    public void showClients(){
        for (int i = 0; i < indexClient; i++) {
            System.out.println(clients[i]);
        }
    }

    public boolean addClient(Client client, Equipment equipment){
        if(indexClient >= clients.length) {
            return false;
        }
        equipments[indexClient] = equipment;
        clients[indexClient++] = client;

        income = income + equipment.priceRepair();
        return true;
    }

    public String getName() {
        return name;
    }

    public int numOfEmployees() {
        return index;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public EmployeeSC[] getEmployees() {
        return employees;
    }


    public ServiceCenter(String name, int numOfEmployee, int numOfEquipment) {
        this.name = name;
        employees = new EmployeeSC[numOfEmployee];

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean addEmployee(EmployeeSC employee) {
        if (index >= employees.length) {
            System.out.println("We cant add new employee");
        }
        employees[index++] = employee;
        return true;
    }

    public boolean fireEmployee(String name) {
        for (int i = 0; i < index; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                employees[i] = null;
                index--;
                return true;
            }
        }
        return false;
    }

    public void showEmployees() {
        for (int i = 0; i < index; i++) {
            System.out.println(employees[i].toString());
        }
    }

    @Override
    public String toString() {
        return "ServiceCenter - " + name + ", " + getAddress().toString();
    }
}
