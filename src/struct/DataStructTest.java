package struct;

import org.junit.Test;
import struct.queque.MyQueque;
import struct.stack.MyStack;

public class DataStructTest {

    @Test
    public void testQueque(){
        MyQueque myQueque = new MyQueque(4);
        myQueque.inputNumber(4);
        myQueque.inputNumber(2);

        myQueque.outputNumber();
        myQueque.outputNumber();
        myQueque.outputNumber();

        myQueque.inputNumber(5);
        myQueque.inputNumber(1);
        myQueque.inputNumber(10);
        myQueque.show();

    }

    @Test
    public void testStack(){
        MyStack myStack = new MyStack(4);
        myStack.pushStack(10);
        myStack.pushStack(15);
        myStack.pushStack(18);
        myStack.pushStack(8);
        myStack.pushStack(57);
        //myStack.show();
        myStack.popStack();
        myStack.popStack();
        myStack.popStack();
        myStack.popStack();
        myStack.popStack();
    }
}
