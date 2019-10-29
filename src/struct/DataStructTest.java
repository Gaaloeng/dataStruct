package struct;

import org.junit.Test;
import struct.queque.MyQueque;

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
}
