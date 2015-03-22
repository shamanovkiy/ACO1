package homework2.parking;


public class Vehicle {
    private int year;
    private String brand;
    private String color;
    private String model;
    private boolean condition;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicle(){
    }

    public Vehicle(String brand, String model, String color, int year, boolean condition){
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.condition = condition;
    }


    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString(){
        return  color + " " + brand + " " + model + " " + year + " year.";
     }

    public void drive(){
        if (condition){
            System.out.println("I can drive by " + brand + " " + model);
        }
        else{
            System.out.println("I can't drive by " + brand + " " + model);
        }
    }


}
