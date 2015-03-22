package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Company {
    private String name;
    private Address address;
    private int id;
    private Employee[] employees = new Employee[10];
    private int count;
    public Scanner sc = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public boolean addEmployees(Employee employee) {
        boolean added = false;
        if (count < employees.length) {
            employees[count] = employee;
            count++;
            added = true;
        }
        return added;
    }

    public void showEmployees() {
        for (int i = 0; i < count; i++) {
            if (employees[i] == null) {
                i++;
            }
            employees[i].showInfo();
        }
    }

    public void showEmployees1Year() {
        for (int i = 0; i < count; i++) {
            if (employees[i].getWorkExp() > 12) {
                employees[i].showInfo();
            }
        }
    }

    public void showGirlsInKiev() {
        for (int i = 0; i < count; i++) {
            if (employees[i].getSex().equalsIgnoreCase("woman") &&
                    employees[i].getAddress().getCity().equalsIgnoreCase("Kyiv")) {
                employees[i].showInfo();
            }
        }
    }

    public void showInfo() {
        System.out.println(name + " Company, " +
                address.getStreet() + " " + address.getBuilding() + ", " + address.getCity() + ", " +
                address.getCountry());
    }

    public boolean fireEmployee(int id) {
        boolean fire = true;
        if (id >= count || id < 0 || employees[id - 1] == null) {
            fire = false;
        }
        employees[id - 1] = null;
        System.out.println("fire - " + fire);
        return fire;
    }

    public boolean fireNoob() {
        boolean fire = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].getSalary() < 1000 && employees[i].getWorkExp() < 12) {
                employees[i] = null;
                fire = true;

                break;
            }
        }
        System.out.println("fire a new employee - " + fire);
        return fire;
    }


    public void sortEmployee() {
        Employee[] employeesSort = new Employee[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employeesSort[i] = employees[i];
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (employeesSort[j] == null) {
                    j++;
                }
                if (employeesSort[j].getSex().equalsIgnoreCase("man") &&
                        employeesSort[j + 1].getSex().equalsIgnoreCase("woman")) {
                    Employee test = employeesSort[j];
                    employeesSort[j] = employeesSort[j + 1];
                    employeesSort[j + 1] = test;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            if (employeesSort[i] == null) {
                i++;
            }
            employeesSort[i].showInfo();
        }
    }

    public void changeInfo(int id) {
        boolean chose1 = true;
        while (chose1) {
            System.out.println("1. Name - " + employees[id-1].getName());
            System.out.println("2. Sex - " + employees[id-1].getSex());
            System.out.println("3. Age - " + employees[id-1].getAge());
            System.out.println("4. Salary - " + employees[id-1].getSalary());
            System.out.println("5. Work experience - " + employees[id-1].getWorkExp());
            System.out.println("6. City - " + employees[id-1].getAddress().getCity());
            System.out.println("7. Exit.");
            int chose2 = sc.nextInt();
            if (chose2 == 1) {
                System.out.println("Write new name");
                String nName = sc.next();
                employees[id - 1].setName(nName);
                continue;
            } else if (chose2 == 2) {
                System.out.println("Write new sex");
                String nSex = sc.next();
                employees[id - 1].setSex(nSex);
                continue;
            } else if (chose2 == 3) {
                System.out.println("Write new age");
                int nAge = sc.nextInt();
                employees[id - 1].setAge(nAge);
                continue;
            } else if (chose2 == 4) {
                System.out.println("Write new salary");
                int nSalary = sc.nextInt();
                employees[id - 1].setSalary(nSalary);
                continue;
            } else if (chose2 == 5) {
                System.out.println("Write new work experience in month");
                int nWorkExp = sc.nextInt();
                employees[id - 1].setWorkExp(nWorkExp);
                continue;
            }
            else if(chose2 == 6){
                System.out.println("Write new city");
                String nCity = sc.next();
                Address nAddress = new Address();
                nAddress.setCity(nCity);
                employees[id-1].setAddress(nAddress);
                continue;
            }
            else if(chose2 == 7){
                break;
            }
        }
    }

}


