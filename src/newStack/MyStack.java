package newStack;


public class MyStack implements IStack{

    private static final int DEFAULT_SIZE = 16;

    private Object[] elements;
    private int index;

    public MyStack() {
        this(DEFAULT_SIZE);
    }

    public MyStack(int size) {
        elements = new Object[size];
    }

    @Override
    public Object pop() {
        if(index == 0) {
            return null;
        }

        Object top = elements[--index];
        return top;
    }

    @Override
    public boolean push(Object o) {
        if(index >= elements.length) {
            return false;
        }
        elements[index] = o;
        index++;
        return true;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Object peek() {
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
    public int search(Object o) {
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

    public void ensureCapacity(int minCapacity){

    }
}
