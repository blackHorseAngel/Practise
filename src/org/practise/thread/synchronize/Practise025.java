package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 21:53
 * @Version 1.0
 * @See
 */
public class Practise025 extends Thread{
    private Sub2 sub;

    public Practise025(Sub2 sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
//      sub.serviceMethod();
        sub.serviceMethod1();
    }
}
