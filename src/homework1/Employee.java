package homework1;


public class Employee {
    private String name;
    private int salary;
    private Address address;
    private String sex;
    private int age;
    private int workExp;

    public Employee(){
    }

    public Employee(String name, String sex, int age, int salary, String city){
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
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

    public void showInfo(){
        System.out.println("Name - " + name +
                ", age = " + age + ", sex - " + sex +
                ", salary = " + salary + ", work experience = " + workExp + " month, City - " + address.getCity());
    }
}
