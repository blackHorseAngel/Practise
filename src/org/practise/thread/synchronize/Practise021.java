package org.practise.thread.synchronize;

/**
 * @Description "可重入锁"是指自己可以再次获取自己的内部的锁
 * @Author zhangshenming
 * @Date 2020/11/17 9:49
 * @Version 1.0
 * @See
 */
public class Practise021 extends Thread {
    @Override
    public void run() {
        super.run();
        ServiceTest serviceTest = new ServiceTest();
        serviceTest.service1();
    }

    public static void main(String[] args) {
        Practise021 practise021 = new Practise021();
        practise021.start();
    }
}
