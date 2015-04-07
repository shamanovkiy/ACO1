package homework1;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        boolean application = true;
        int num = 5;


        Company company = new Company();
        company.setName("Apple");

        Address adrsCompany = new Address();
        adrsCompany.setCity("Kyiv");
        adrsCompany.setStreet("Kreshchatyk");
        adrsCompany.setBuilding("2a");
        company.setAddress(adrsCompany);

        Employee[] employees = new Employee[10];

        Employee empl1 = new Employee();
        empl1.setName("Vladimir");
        empl1.setAge(25);
        empl1.setSalary(800);
        empl1.setSex("man");
        empl1.setWorkExp(8);
        Address adr1 = new Address();
        adr1.setCity("Kyiv");
        empl1.setAddress(adr1);

        Employee empl2 = new Employee();
        empl2.setName("Ekaterina");
        empl2.setAge(22);
        empl2.setSalary(600);
        empl2.setSex("woman");
        empl2.setWorkExp(3);
        Address adr2 = new Address();
        adr2.setCity("Kyiv");
        empl2.setAddress(adr2);

        Employee empl3 = new Employee();
        empl3.setName("Sergey");
        empl3.setAge(28);
        empl3.setSalary(1200);
        empl3.setSex("man");
        empl3.setWorkExp(18);
        Address adr3 = new Address();
        adr3.setCity("Donetsk");
        empl3.setAddress(adr3);

        Employee empl4 = new Employee();
        empl4.setName("Svetlana");
        empl4.setAge(24);
        empl4.setSalary(800);
        empl4.setSex("woman");
        empl4.setWorkExp(10);
        Address adr4 = new Address();
        adr4.setCity("Kharkiv");
        empl4.setAddress(adr4);

        Employee empl5 = new Employee();
        empl5.setName("Vladislav");
        empl5.setAge(29);
        empl5.setSalary(1500);
        empl5.setSex("man");
        empl5.setWorkExp(20);
        Address adr5 = new Address();
        adr5.setCity("Kyiv");
        empl5.setAddress(adr5);

        company.addEmployees(empl1);
        company.addEmployees(empl2);
        company.addEmployees(empl3);
        company.addEmployees(empl4);
        company.addEmployees(empl5);

        while (application) {
            System.out.println();
            System.out.println("1. Read about company");
            System.out.println("2. View list of employees");
            System.out.println("3. View employees, which work more than year.");
            System.out.println("4. View employees, which are girls and live in Kiev");
            System.out.println("5. Add an employee");
            System.out.println("6. Fire an employee");
            System.out.println("7. Fire an employee, with salary less then 1000 and which works less then year");
            System.out.println("8. Change an employee information");
            System.out.println("9. View list of employees: first women and then men");
            System.out.println("10. Exit");
            int chose = write.nextInt();
            if (chose > 10 || chose < 1) {
                System.out.println("Wrong number");
                continue;
            } else if (chose == 1) {
                company.showInfo();
            } else if (chose == 2) {
                company.showEmployees();
            } else if (chose == 3) {
                company.showEmployees1Year();
            } else if (chose == 4) {
                company.showGirlsInKiev();
            } else if (chose == 5) {
                Employee empl6 = new Employee();
                System.out.println("Write name of employee");
                String name = write.next();
                empl6.setName(name);
                System.out.println("Write sex of employee");
                String sex = write.next();
                empl6.setSex(sex);
                System.out.println("Write age of employee");
                int age = write.nextInt();
                empl6.setAge(age);
                System.out.println("Write salary of employee");
                int salary = write.nextInt();
                empl6.setSalary(salary);
                System.out.println("Write city where employee live");
                String city = write.next();
                Address adr6 = new Address();
                adr6.setCity(city);
                empl6.setAddress(adr6);
                company.addEmployees(empl6);
                num++;
            } else if (chose == 6) {
                System.out.println("Write an id of employee");
                int id = write.nextInt();
                company.fireEmployee(id);
            } else if (chose == 7) {
                company.fireNoob();
            } else if (chose == 8) {
                System.out.println("Write an id of employee");
                int id = write.nextInt();
                company.changeInfo(id);
            } else if (chose == 9) {
                company.sortEmployee();
            } else if (chose == 10) {
                System.out.println("Exit.");
                break;
            }
        }


    }
}
