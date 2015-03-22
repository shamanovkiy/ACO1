package homework2;


import java.util.Scanner;

public class Calculator {
    private double value1;
    private double value2;
    private Scanner s = new Scanner(System.in);

    public void add(){
        System.out.println("Write 1st value");
        value1 = s.nextDouble();
        System.out.println("Write 2nd value");
        value2 = s.nextDouble();
        System.out.println("Result = " + (value1 + value2) + "\n");
    }

    public void minus(){
        System.out.println("Write 1st value");
        value1 = s.nextDouble();
        System.out.println("Write 2nd value");
        value2 = s.nextDouble();
        System.out.println("Result = " + (value1 - value2) + "\n");
    }

    public void divide(){
        System.out.println("Write 1st value");
        value1 = s.nextDouble();
        System.out.println("Write 2nd value");
        value2 = s.nextDouble();
        System.out.println("Result = " + (value1 / value2) + "\n");
    }

    public void multiply(){
        System.out.println("Write 1st value");
        value1 = s.nextDouble();
        System.out.println("Write 2nd value");
        value2 = s.nextDouble();
        System.out.println("Result = " + (value1 * value2) + "\n");
    }


}
