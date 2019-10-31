package struct.stack;

import java.lang.reflect.Array;
import java.util.Objects;

public class MyUniversalStack<T> {
    private int stack_Top;
    private T[] container;
    private int capacity;

    public MyUniversalStack(int capacity,Class type) {
        this.capacity = capacity;
        //泛型数组的创建
        this.container = (T[])Array.newInstance(type,capacity);
        this.stack_Top = 0;
    }

    //获取栈中有多少数据
    public int getStack_Top() {
        return stack_Top;
    }

    //清空栈
    public void clearStack(){
        this.stack_Top = 0;
    }

    //判断栈是否为空
    public boolean isStackNull(){
        if (getStack_Top() <= 0){
            return true;
        }
        return false;
    }

    //判断栈是否为满
    public boolean isStackFull(){
        if (getStack_Top() >= capacity){
            return true;
        }
        return false;
    }

    //入栈
    public void pushStack(T inputData){
        if(isStackFull()){
            System.out.println("栈已满,入栈失败");
        }else {
            container[stack_Top] = inputData;
            stack_Top ++;
            System.out.println("入栈成功");
        }
    }

    //出栈
    public boolean popStack(){
        if (isStackNull()){
            System.out.println("栈已空，出栈失败");
            return false;
        }else {
            //出栈前要先把栈顶回退一步才能指向当前数据
            stack_Top --;
            System.out.println("出栈数据 :"+container[stack_Top]);
            return true;
        }
    }

    //遍历
    public void show(){
        for (int i = stack_Top -1 ; i >= 0; i--){
            System.out.println(container[i]);
        }
    }
}
