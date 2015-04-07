package newStack;


import java.util.Iterator;

public class MyStack<T> implements IStack<T>{
    private static final int DEFAULT_SIZE = 16;

    private T[] elements;
    private int index;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        elements =(T[]) new Object[size];
    }

    @Override
    public T pop() {
        if(index == 0) {
            return null;
        }

        T top = elements[--index];
        return top;
    }

    @Override
    public boolean push(T o) {
        if(index >= elements.length) {
            return false;
        }
        ensureCapacity();
        elements[index] = o;
        index++;
        return true;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public T peek() {
        if(index == 0) {
            return null;
        }
        return  elements[index - 1];
    }

    @Override
    public boolean empty() {
        return index == 0;
    }

    @Override
    public int search(T o) {
        int temp = 0;
        if(index == 0){
            temp = -1;
        }
        for(int i = index; i > 0; i--){
            if(elements[i] == o){
                return i;
            }
        }
        return temp;
    }

    private void ensureCapacity(){
        if(index == elements.length){
            T[] newElements =(T[]) new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
                this.elements = newElements;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<E> implements Iterator<E> {
        int iteratorIndex = index - 1;

        @Override
        public boolean hasNext() {
            if (iteratorIndex < 0) {
                return false;
            }
            return elements[iteratorIndex] != null;
        }


        @Override
        public E next() {
            return (E) elements[iteratorIndex--];
        }
    }
}
