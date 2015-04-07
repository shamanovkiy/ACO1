package newList;


import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class MyList<T> extends AbstractList<T> {
    private T[] elements;
    private int count;

    public MyList() {
    }

    public MyList(int size) {
        this.elements =(T[]) new Object[size];
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        T temp = elements[index];
        elements[index] = element;
        return temp;
    }

    @Override
    public void add(int index, T element) {
        if (index >= count || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, count - index);
        elements[index] = element;
        count++;
    }

    @Override
    public boolean add(T o) {
        ensureCapacity();
        if (count <= elements.length) {
            elements[count++] = o;
            return true;
        }
        return false;
    }

    private void ensureCapacity() {
        if (count >= elements.length) {
            T[] newElements =(T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        T temp = elements[index];
        System.arraycopy(elements, index + 1, elements, index, count - index);

        elements[count--] = null;
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        for (int i = count - 1; i >= 0; i--) {
            remove(i);
        }
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > count || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        MyList newList = new MyList(toIndex - fromIndex + 1);
        Object[] target = new Object[toIndex - fromIndex + 1];
        System.arraycopy(elements, fromIndex, target, 0, target.length);
        newList.setElements(target);
        return newList;
    }

    private void setElements(T[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(o)) {
                System.arraycopy(elements, i + 1, elements, i, count - i - 1);
                elements[--count] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] newArray =(T[]) new Object[count];
        System.arraycopy(elements, 0, newArray, 0, count);
        return newArray;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < count; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    public Iterator<T> iterator() {
        return new MyIterator<T>();
    }

    private class MyIterator<E> implements Iterator<E> {
        int iteratorIndex = count - 1;

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