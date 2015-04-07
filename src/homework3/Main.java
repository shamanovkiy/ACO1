package homework3;


import homework1.Address;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static boolean working = true;
    static ServiceCenter serviceCenter = new ServiceCenter("Topka", 15, 15);
    static Director director = new Director(serviceCenter);
    static Administrator administrator = new Administrator(serviceCenter);
    static Repairman repairman = new Repairman();

    public static void main(String[] args) {

        while (working) {
            System.out.println("Enter login (or press E to exit)");
            String login = scanner.next();
            if(login.equalsIgnoreCase("director")){
                directorTerminal();
            }
            else if(login.equalsIgnoreCase("administrator")){
                administratorTerminal();
            }
            else if(login.equalsIgnoreCase("repairman")){
                repairmanTerminal();
            }
            else if(login.equalsIgnoreCase("e")){
                working = false;
            }
        }
    }

    private static void directorTerminal(){
        while (working){
            System.out.println("1. Сменить место расположения сервисного центра");
            System.out.println("2. Нанять сотрудника");
            System.out.println("3. Уволить сотрудника");
            System.out.println("4. Платить налог");
            System.out.println("5. Посмотреть всех сотрудников");
            System.out.println("6. Увеличить зарплату сотрудникам на 10%");
            System.out.println("7. Заплатить з/п сотрудникам");
            System.out.println("8. Выход");
            int chose = scanner.nextInt();
            if(chose == 1){
                System.out.println("Введите город");
                String city = scanner.next();
                System.out.println("Введите улицу");
                String street = scanner.next();
                Address newAddress = new Address(city, street);
                director.changeAddressSC(newAddress);
            }
            else if(chose == 2){
                System.out.println("Введите имя");
                String name = scanner.next();
                System.out.println("Введите возраст");
                int age = scanner.nextInt();
                System.out.println("Введите зар. плату");
                int salary = scanner.nextInt();
                EmployeeSC employeeSC = new EmployeeSC(name, age, salary);
                director.addEmployee(employeeSC);
            }
            else if(chose == 3){
                System.out.println("Введите имя сотрудника");
                String name = scanner.next();
                director.fireEmployee(name);
            }
            else if(chose == 4){
                System.out.println("Введите налог в %");
                double tax = scanner.nextDouble();
                director.payTax(tax);
            }
            else if(chose == 5){
                director.showEmployees();
            }
            else if(chose == 6){
                director.increaseSalary();
            }
            else if(chose == 7){
                director.paySalary();
            }
            else if(chose == 8){
                working = false;
            }
        }
    }

    private static void administratorTerminal(){
       while(working) {
           System.out.println("1. Посмотреть всех клиентов");
           System.out.println("2. Взять на ремонт технику");
           System.out.println("3. Отдать отремонтированный товар клиенту");
           System.out.println("4. Передать технику специалисту по ремонту");
           System.out.println("5. Выход");
           int chose = scanner.nextInt();
           if(chose == 1){
               administrator.showClients();
           }
           else if(chose == 2){
               System.out.println("Введите имя клиента");
               String clientName = scanner.next();
               System.out.println("Введите модель техники");
               String model = scanner.next();
               Equipment equipment = new Equipment(model);
               Client client = new Client(clientName, equipment);
               administrator.addClient(client, equipment);
           }
           else if(chose == 3){
               System.out.println("Введите имя клиента");
               String clientName = scanner.next();
               administrator.giveToClient(clientName);
           }
           else if(chose == 4){
               System.out.println("Введите модель техники");
               String model = scanner.next();
               administrator.giveToRepair(model, repairman);
           }
           else if(chose == 5){
               working = false;
           }
       }
    }

    private static void repairmanTerminal(){
        while(working){
            System.out.println("1. Ремонтировать");
            System.out.println("2. Возвратить отремонтированную технику администратору");
            System.out.println("3. Выход");
            int chose = scanner.nextInt();
            if(chose == 1){
                repairman.repair();
            }
            if(chose == 2){
                repairman.returnEquipment();
            }
            if(chose == 3){
                working = false;
            }
        }
    }
}
