package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;
    private T val;

    public LinkedListStack() {
       data = new LinkedList<T>(); // homework
    }

    @Override
    public boolean push(T val) {

        data.push(val);
        return true;

    }

    @Override
    public T pop() {
        if (data.size() == 0) {
            return null;
        }
        T val = data.pop();
        return val;
    }

    @Override
    public T peek() {

        T val = data.peek();
        return val;
    }

    @Override
    public int size() {
        return data.size();
    }
}
