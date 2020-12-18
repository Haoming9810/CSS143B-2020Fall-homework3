package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        this.data = (T[])new Object[capacity];
        this.size = 0;

    }

    @Override
    public boolean push(T val) {

        if(this.size == this.data.length) {
            return false;
        }else {
            this.data[size] = val;
            ++size;
            return true;
        }
    }

    @Override
    public T pop() {

        if(this.size == 0){
            return null;
        }else {

            return this.data[size-- - 1];
        }
    }

    @Override
    public T peek() {

        if(this.size <= 0) {
            return null;
        }else {
            return this.data[size - 1];
        }
    }

    @Override
    public int size() {
        return size;
    }
}