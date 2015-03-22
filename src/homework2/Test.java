package homework2;


public class Test {
    public static void main(String[] args) {

        Array mas = new Array(5);

        Array mas1 = new Array(5);

        mas.getMas()[1] = 5;
        mas1.getMas()[1] = 5;

        mas.showArray();
        mas1.showArray();

        System.out.println(mas.equals(mas1));


        System.out.println();


        Fraction dr = new Fraction(1, 3);
        Fraction d = new Fraction(1, 2);
        Fraction n1 = dr.addFractions(d);
        Fraction n2 = dr.minusFractions(d);
        Fraction n3 = dr.multiplyFractions(d);
        Fraction n4 = dr.divideFractions(d);

        System.out.println(n1.getFraction());
        System.out.println(n2.getFraction());
        System.out.println(n3.getFraction());
        System.out.println(n4.getFraction());

        System.out.println();





    }
}
