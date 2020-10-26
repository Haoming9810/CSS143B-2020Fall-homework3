package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
    }

    @Override
    public boolean push(T val) {

        if (data == null){
            return false;
        }
        else {
            data.push(val);
            return true;
        }
    }

    @Override
    public T pop() {
        T result = data.pop();

        return result;
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
