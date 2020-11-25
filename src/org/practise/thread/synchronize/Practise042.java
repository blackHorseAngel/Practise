package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/21 12:40
 * @Version 1.0
 * @See
 */
public class Practise042 implements Runnable{

    private TestService1 testService1;

    private Object obj;

    public Practise042(TestService1 testService1, Object obj) {
        this.testService1 = testService1;
        this.obj = obj;
    }

    @Override
    public void run() {
        testService1.testMethod1(obj);
    }
}
