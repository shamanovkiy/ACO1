package homework3;


import homework1.Address;

public class Director extends EmployeeSC {

    private ServiceCenter serviceCenter;

    public double showIncome(ServiceCenter serviceCenter){
       return serviceCenter.getIncome();
    }

    public Director(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
    }

    public void changeAddressSC(Address address){
        serviceCenter.setAddress(address);
    }

    public void addEmployee(EmployeeSC employeeSC){
        serviceCenter.addEmployee(employeeSC);
    }

    public void fireEmployee(EmployeeSC employeeSC){
        serviceCenter.fireEmployee(employeeSC);
    }

    public void showEmployees(){
        serviceCenter.showEmployees();
    }

    public boolean payTax(int tax){
        if(serviceCenter.getIncome() >= tax) {
            serviceCenter.setIncome(serviceCenter.getIncome() - tax);
            return true;
        }
        return false;
    }

    public void increaseSalary(){
        for (int i = 0; i < serviceCenter.numOfEmployees(); i++) {
            serviceCenter.getEmployees()[i].setSalary(serviceCenter.getEmployees()[i].getSalary() * 0.1 +
                    serviceCenter.getEmployees()[i].getSalary());
        }
    }

    public boolean paySalary(){
        double sumSalary = 0;
        for (int i = 0; i < serviceCenter.numOfEmployees(); i++) {
            sumSalary = sumSalary +  serviceCenter.getEmployees()[i].getSalary();
        }
        if(serviceCenter.getIncome() >= sumSalary){
            serviceCenter.setIncome(serviceCenter.getIncome() - sumSalary);
            return true;
        }
        return false;
    }

}
