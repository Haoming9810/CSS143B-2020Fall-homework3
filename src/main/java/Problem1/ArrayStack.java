package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        size = capacity;
        data = (T[])new Object[size] ;
    }

    @Override
    public boolean push(T val) {
        if (size == 0) {

            return false;
        } else {
            size++;
            return true;
        }

    }


    @Override
    public T pop() {


        if (size == 0) {

            return null;
        }
        T val = data[size];


        size--;
        return val;

    }

    @Override
    public T peek() {
        // homework
        if (size==0) {

            return null;
        }
        T val = data[size];
        size --;
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
