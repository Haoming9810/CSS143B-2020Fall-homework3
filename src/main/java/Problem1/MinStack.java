package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    private Stack<Integer> auxStack;
    public MinStack(int size) {
        // homework
        super(size);
        auxStack = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        Integer item = auxStack.peek();
        if (item == null || val<item){
            auxStack.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
       Integer auxItem = auxStack.peek();
       Integer item = super.peek();
       if(item != null&& item.intValue() == auxItem.intValue()){
           auxStack.pop();
       }
       return super.pop();
    }

    public Integer getMin() {
        return auxStack.peek();
    }
}

