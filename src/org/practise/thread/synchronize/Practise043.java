package org.practise.thread.synchronize;

/**
 * @Description 当多个线程同时执行synchronized（非this对象X）同步代码块时呈同步效果
 * @Author zhangshenming
 * @Date 2020/11/21 12:41
 * @Version 1.0
 * @See
 */
public class Practise043 implements Runnable{

    private TestService1 testService1;

    private Object obj;

    public Practise043(TestService1 testService1, Object obj) {
        this.testService1 = testService1;
        this.obj = obj;
    }

    @Override
    public void run() {
        testService1.testMethod1(obj);
    }

    public static void main(String[] args) {
        TestService1 testService1 = new TestService1();
        Object obj = new Object();
        Practise042 practise042 = new Practise042(testService1,obj);
        Thread t1 = new Thread(practise042);
        t1.start();
        Practise043 practise043 = new Practise043(testService1,obj);
        Thread t2 = new Thread(practise043);
        t2.start();
    }
}
