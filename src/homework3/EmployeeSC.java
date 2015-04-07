package homework3;


import homework1.Address;

public class EmployeeSC {
    private String name;
    private double salary;
    private int age;

    public EmployeeSC(){
    }

    public EmployeeSC(String name, int age, double salary){
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return String.format("Name - %s, age - %d, salary - %.1f", name, age, salary);
    }
}
