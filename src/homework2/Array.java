package homework2;

public class Array {
    private int length;
    private int[] mas = new int[length];

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }

    public Array(int length) {
        this.length = length;
        int[] mas = new int[length];
        setMas(mas);
    }

    public void showArray() {
        System.out.print("\n{");
        for (int i = 0; i < length - 1; i++) {
            System.out.print(this.getMas()[i] + " ");
        }
        System.out.print(mas[length - 1] + "}");

        System.out.println();
    }

    public int findMin() {
        int min = mas[0];
        for (int i = 0; i < length; i++) {
            if (min > mas[i]) {
                min = mas[i];
            }
        }

        return min;
    }

    public int findMax() {
        int max = mas[0];
        for (int i = 0; i < length; i++) {
            if (max < mas[i]) {
                max = mas[i];
            }
        }
        return max;
    }

    public void randomArray(int d1, int d2) {
        for (int i = 0; i < length; i++) {
            mas[i] = (int) (Math.random() * (d2 - d1) + d1);
        }
    }

    public int[] increaseArray(int newLength) {
        int[] newMas = new int[newLength];
        if (newLength <= length) {
            System.out.println("\nNew length is less then old");
            return mas;
        } else {
            for (int i = 0; i < length; i++) {
                newMas[i] = mas[i];
            }
            setMas(newMas);
            length = newLength;
        }
        return newMas;
    }

    public void sortArray() {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    int c = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = c;
                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Array)) {
            return false;
        }

        Array mas = (Array) obj;
        if (mas.length != this.length) {
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            if (mas.getMas()[i] != this.getMas()[i]) {
                return false;
            }
        }

        return true;
    }
}
