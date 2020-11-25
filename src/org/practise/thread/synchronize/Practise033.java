package org.practise.thread.synchronize;

/**
 * @Description 当一个线程访问object的一个synchronized（this）的同步代码块的方法时，其他线程对同一个object中所有其他synchronized（this）同步代码块的访问江北阻塞，即说明了synchronized使用的
 * 对象监视器是同一个，即锁死同一个
 * @Author zhangshenming
 * @Date 2020/11/19 20:28
 * @Version 1.0
 * @See
 */
public class Practise033 extends Thread{

    private ObjectService objectService;

    public Practise033(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }

    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        Practise032 practise032 = new Practise032(objectService);
        practise032.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Practise033 practise033 = new Practise033(objectService);
        practise033.start();
    }
}
