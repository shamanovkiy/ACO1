package homework3;


import java.util.Date;

public class Equipment {

    private String model;
    private double price;
    private boolean condition;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equipment)) return false;

        Equipment equipment = (Equipment) o;

        if (model != null ? !model.equals(equipment.model) : equipment.model != null) return false;

        return true;
    }


    public Equipment(String model, double price, boolean condition) {
        this.model = model;
        this.price = price;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", price=" + price +
                ", condition=" + condition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void showPrice(){
        System.out.println("Price = " + price);
    }

    public void showCondition(){
        if(condition){
            System.out.println("Equipment can be used");
            return;
        }
            System.out.println("Equipment can't be used");
    }

    public double priceRepair(){
        return 0.1 * price;
    }

}
