package helper;


public class ArrayHelper {

    public static int[] createArray(int size) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        return mas;
    }

    public static void printArray(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayRec(int[] mas, int i) {
        if (i > mas.length - 1) {
            return;
        }
        System.out.print(mas[i++] + " ");
        printArrayRec(mas, i);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int c = array[j];
        array[j] = array[i];
        array[i] = c;
    }

    public static int findBinary(int[] mas, int value){
        int start = 0;
        int end = mas.length - 1;
        while(start <= end){
            int mid = (end + start) / 2;

            if(mas[mid] == value){
                return mid;
            }
            else if(mas[mid] > value){
                end = mid - 1;
            }
            else if(mas[mid] < value){
                start = mid + 1;
            }
        }
        return -1;
    }
}