package newStack;

import newStack.IStack;

import java.util.EmptyStackException;
import java.util.Iterator;


public class MyLinkedStack<T> implements IStack<T> {
    private Node top;
    private int size;


    @Override
    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T temp = (T) top.value;
        top = top.next;
        size--;
        return temp;
    }

    @Override
    public boolean push(T o) {
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
    public T peek() {
        return (T) top.value;
    }

    @Override
    public boolean empty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int search(Object o) {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<E> implements Iterator<E> {

        @Override
        public boolean hasNext() {
            return top != null;
        }


        @Override
        public E next() {
            return (E) top;
        }
    }

    private static class Node<T> {
        T value;
        Node next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}