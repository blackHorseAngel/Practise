package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 20:42
 * @Version 1.0
 * @See
 */
public class Practise023 extends Thread {

    private  ServiceTest2 serviceTest2;

    public Practise023(ServiceTest2 serviceTest2) {
        this.serviceTest2 = serviceTest2;
    }

    @Override
    public void run() {
        super.run();
        serviceTest2.testMethod();
    }
}
