package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 21:39
 * @Version 1.0
 * @See
 */
public class Practise036 extends Thread{

    private ServiceNew serviceNew;

    public Practise036(ServiceNew serviceNew) {
        this.serviceNew = serviceNew;
    }

    @Override
    public void run() {
        super.run();
        serviceNew.setUserNamePassword("a","aa");
    }
}
