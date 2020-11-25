package org.practise.thread.synchronize;

/**
 * @Description synchronized(非this对象X)同步代码块，持有不同的锁是异步
 * @Author zhangshenming
 * @Date 2020/11/20 22:18
 * @Version 1.0
 * @See
 */
public class Practise039 extends Thread{

    private ServiceNew2 serviceNew2;

    public Practise039(ServiceNew2 serviceNew2) {
        this.serviceNew2 = serviceNew2;
    }

    @Override
    public void run() {
        super.run();
        serviceNew2.methodB();
    }

    public static void main(String[] args) {
        ServiceNew2 serviceNew2 = new ServiceNew2();
        Practise038 practise038 = new Practise038(serviceNew2);
        practise038.start();
        Practise039 practise039 = new Practise039(serviceNew2);
        practise039.start();
    }
}
