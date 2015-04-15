package newList;


import java.util.*;

public class MyLinkedList<T> implements List<T> {
    private Node last;
    private int size;
    private Node first;

    @Override
    public boolean add(T o) {
        if(size == 0) {
            Node<T> node = new Node<T>(null, o, null);
            first = node;
            last = node;
        }else{
            Node<T> node = new Node<T>(last, o, null);
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean contains(Object o) {
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if(node.value.equals(o)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            array[i] = node;
            node = node.next;
        }
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if(node.value.equals(o)){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = null;
                node.prev = null;
                node.value = null;
                size--;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        if(size > 0) {
            Node<T> node = first;
            for (int i = 0; i < size; i++) {
                node.value = null;
                node.prev = null;
                node = node.next;
            }
            size = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyLinkedList)) return false;

        MyLinkedList that = (MyLinkedList) o;

        if (size != that.size) return false;
        if (first != null ? !first.equals(that.first) : that.first != null) return false;
        if (last != null ? !last.equals(that.last) : that.last != null) return false;

        return true;
    }


    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> node = first;
        if(index < (size / 2)) {
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size -1 ; i > index; i--) {
                node = node.prev;
            }
        }
        return node.value;
    }

    private void checkIndex(int index) {
        if(index < 0 || index > size -1){
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        T temp = node.value;
        node.value = element;
        return temp;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);
        if(index == 0){
            Node<T> node = new Node(null, element, first);
            first = node;
            size++;
        }else{
            Node<T> n1 = first;
            for (int i = 0; i < index - 1; i++) {
                n1 = n1.next;
            }
            Node<T> next = n1.next;
            Node<T> node = new Node(n1, element, next);
            next.prev = node;
            n1.next = node;
            size++;
        }

    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        T temp = node.value;
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
        node.value = null;
        size--;
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        Node<T> node = first;
        for (int i = 0; i < size; i++) {
            if(!node.value.equals(o)){
                return -1;
            }
            if(node.value.equals(o)){
                return index;
            }
            index++;
            node = node.next;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }




    private static class Node<T>{
        T value;
        Node<T> next;
        Node<T> prev;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<T> node = (Node) o;
            if (value != null ? !value.equals(node.value) : node.value != null) return false;
            return true;
        }

        public Node(Node prev ,T value, Node next){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "{value = " + value +
                    '}';
        }
    }
}
