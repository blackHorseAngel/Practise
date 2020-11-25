package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 22:05
 * @Version 1.0
 * @See
 */
public class Practise038 extends Thread{

    private ServiceNew2 serviceNew2;

    public Practise038(ServiceNew2 serviceNew2) {
        this.serviceNew2 = serviceNew2;
    }

    @Override
    public void run() {
        super.run();
        serviceNew2.methodA();
    }
}
