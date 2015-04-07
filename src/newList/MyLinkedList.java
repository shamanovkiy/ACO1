package newList;


import java.util.AbstractSequentialList;
import java.util.ListIterator;

public class MyLinkedList extends AbstractSequentialList {
    private Node top;
    private int size;


    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        Node n = new Node(o, top);
        top = n;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return super.get(index);
    }

    @Override
    public Object set(int index, Object element) {
        return super.set(index, element);
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return super.remove(index);
    }

    @Override
    public void clear() {
        super.clear();
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public boolean remove(Object o) {
        if(top.next.value == o){
            top.next = top.next.next;
            size--;
            return true;
        }
        return false;
    }

    private static class Node{
        Object value;
        Node next;

        public Node(Object value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
