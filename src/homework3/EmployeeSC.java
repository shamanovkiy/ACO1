package homework3;


import homework1.Address;

public class EmployeeSC {
    private String name;
    private double salary;
    private Address address;
    private String sex;
    private int age;
    private int workExp;

    public EmployeeSC(){
    }

    public EmployeeSC(String name, String sex, int age, double salary, String city){
        this.name = name;
        this.salary = salary;
        city = address.getCity();
        this.sex = sex;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    public int getWorkExp() {
        return workExp;
    }

    @Override
    public String toString() {
        return String.format("Name - %s, sex - %s, age - %d, salary - %d, experience - %d",
                name, sex, age, salary, workExp);
    }
}
