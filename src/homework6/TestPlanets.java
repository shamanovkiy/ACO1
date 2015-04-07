package homework6;


import java.util.Scanner;

public class TestPlanets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean working = true;
        while(working){
            System.out.println("1. Show information about the planet");
            System.out.println("2. Show planets list");
            System.out.println("3. Exit");
            int chose = sc.nextInt();
            if(chose == 1){
                System.out.println("1. Enter name of planet");
                System.out.println("2. Enter number of planet");
                System.out.println("3. Exit");
                int chose1 = sc.nextInt();
                if(chose1 == 1){
                    System.out.println("Enter please name of planet");
                    String name = sc.next();
                    for (int i = 0; i < 8; i++) {
                        if (Planets.values()[i].getName().equalsIgnoreCase(name)) {
                            System.out.println(Planets.values()[i]);
                        }
                    }
                }
                else if(chose1 == 2){
                    System.out.println("Enter please number of planet");
                    int number = sc.nextInt();
                    if(number < 1 || number > 8){
                        System.out.println("Wrong number");
                    }
                    else {
                        for (int i = 0; i < 8; i++) {
                            if (Planets.values()[i].getNumber() == number) {
                                System.out.println(Planets.values()[i]);
                            }

                        }
                    }
                }
                else if(chose1 == 3){
                    return;
                }
            }
            else if(chose == 2){
                for (int i = 0; i < 8; i++) {
                    System.out.print(Planets.values()[i].getName() + " ");
                }
                System.out.println();
            }
            else if(chose == 3){
                return;
            }
        }
    }
}
