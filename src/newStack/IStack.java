package newStack;



public interface IStack<T> extends Iterable<T> {

    T pop();

    boolean push(T o);

    int size();

    T peek();

    boolean empty();

    int search(T o);
}
