package homework2;


public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }



    public Number addNumber(Number number){
        return new Number(this.value + number.getValue());
    }

    public Number minusNumber(Number number){
        return new Number(this.value - number.getValue());
    }

    public Number divideNumber(Number number){
        return new Number(this.value / number.getValue());
    }

    public Number multiplyNumber(Number number){
        return new Number(this.value * number.getValue());
    }

    public Number degreeNumber(Number number){
        return new Number(Math.pow(this.value, number.getValue()));
    }

    public Number residueNumber(Number number){
        return new Number(this.value % number.getValue());
    }

    public Number factorialNumber(){
        Number n = new Number(1);
        for (int i = 2; i <= this.value; i++) {
            n.value *= i;
        }
        return n;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if(!(obj instanceof Number)) {
            return false;
        }

        Number other = (Number) obj;
        return other.getValue() == this.value;

    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
