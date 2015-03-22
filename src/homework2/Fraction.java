package homework2;


public class Fraction {
    private double fraction;
    private int denominator;
    private int numerator;

    public double getFraction() {
        return fraction;
    }

    public void setFraction(double fraction) {
        this.fraction = fraction;
    }

    public Fraction(int denominator, int numerator){
        this.denominator = denominator;
        this.numerator = numerator;
        this.fraction = (double) denominator / numerator;
    }

    public Fraction addFractions(Fraction fraction){
        if(fraction.numerator != numerator){
            return new Fraction(fraction.denominator * numerator + denominator * fraction.numerator,
                    fraction.numerator * numerator);
        }
            return new Fraction(fraction.denominator + denominator, numerator);
    }

    public Fraction minusFractions(Fraction fraction){
        if(fraction.numerator != numerator){
            return new Fraction(denominator * fraction.numerator - fraction.denominator * numerator,
                    fraction.numerator * numerator);
        }
        return new Fraction(denominator - fraction.denominator, numerator);
    }

    public Fraction multiplyFractions(Fraction fraction){
        return new Fraction(fraction.denominator * denominator, fraction.numerator * numerator);
    }

    public Fraction divideFractions(Fraction fraction){
        return new Fraction(fraction.numerator * denominator, fraction.denominator * numerator);
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if(!(obj instanceof Fraction)) {
            return false;
        }

        Fraction fraction = (Fraction) obj;
        return fraction.denominator == denominator && fraction.numerator == numerator;
    }

    @Override
    public String toString(){
        return String.valueOf(fraction);
    }



}
