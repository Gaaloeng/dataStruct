package struct.queque;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

public class MyQueque {
    private int length;
    private int capacity;
    private int q_head;
    private int q_trail;
    private int[] container;
    private int outputNum;

    public MyQueque(int capacity) {
        this.capacity = capacity;
        this.container = new int[capacity];
        this.length = 0;
        this.q_head = 0;
        this.q_trail = 0;
    }

    //获取长度
    public int getLength() {
        return length;
    }

    //判空
    protected boolean isNullQueque(){
        if(getLength() <= 0){
            return true;
        }
        return false;
    }

    //判满
    protected boolean isFullQueque(){
        if(getLength() >= this.capacity){
            return true;
        }
        return false;
    }

    //入队
    public boolean inputNumber(int number){
        if (isFullQueque()){
            System.out.println("队列已满,不可存放数据");
            return false;
        }
        //先存数据，再移动尾下标
        this.container[q_trail] = number;
        System.out.println("存入成功,存入到第 "+q_trail+"个");
        this.q_trail++;
        this.q_trail = q_trail % capacity;
        this.length++;
        return true;
    }

    //出队
    public boolean outputNumber(){
        if (isNullQueque()){
            System.out.println("队列为空,不可输出数据");
            return false;
        }
        //先出值，再移动头下标
        System.out.println("出队数值: "+container[q_head]);
        q_head ++;
        q_head = q_head % capacity;
        length --;
        return true;
    }

    //遍历
    public void show(){
        for (int i = q_head; i < length + q_head; i++){
            System.out.println(container[i % capacity]);
        }
    }
}
