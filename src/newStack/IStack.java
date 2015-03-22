package newStack;



public interface IStack {

    Object pop();

    boolean push(Object o);

    int size();

    Object peek();

    boolean empty();

    int search(Object o);

    void ensureCapacity(int minCapacity);
}
