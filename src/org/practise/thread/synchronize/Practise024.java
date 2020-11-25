package org.practise.thread.synchronize;

/**
 * @Description 当一个线程的执行的代码出现异常时。其所持有的锁回自动释放
 * @Author zhangshenming
 * @Date 2020/11/18 20:44
 * @Version 1.0
 * @See
 */
public class Practise024 extends Thread {

    private ServiceTest2 serviceTest2;

    public Practise024(ServiceTest2 serviceTest2) {
        this.serviceTest2 = serviceTest2;
    }

    @Override
    public void run() {
        super.run();
        serviceTest2.testMethod();
    }

    public static void main(String[] args) {
        ServiceTest2 serviceTest = new ServiceTest2();
        try {
            Practise023 practise023 = new Practise023(serviceTest);
            practise023.setName("a");
            practise023.start();
            Thread.sleep(1000);
            Practise024 practise024 = new Practise024(serviceTest);
            practise024.setName("b");
            practise024.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

