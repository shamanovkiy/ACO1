package newList;

import java.util.List;

public class TestList {

    public static void main(String[] args) {
        List<Integer> list = new MyLinkedList<Integer>();

        Integer i = new Integer(6);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(5);

        System.out.println(list.set(2, 5));
        System.out.println();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
    }
}
