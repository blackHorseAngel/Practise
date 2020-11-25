package org.practise.thread.synchronize;

/**
 * @Description synchronized(非this对象X)同步代码块：当多个线程争抢相同的“非this对象X”的锁时，同一时间只有一个线程可以执行synchronized（非this对象X）同步代码块中的代码
 * @Author zhangshenming
 * @Date 2020/11/20 21:41
 * @Version 1.0
 * @See
 */
public class Practise037 extends Thread{

    private ServiceNew serviceNew;

    public Practise037(ServiceNew serviceNew) {
        this.serviceNew = serviceNew;
    }

    @Override
    public void run() {
        super.run();
        serviceNew.setUserNamePassword("b","bb");
    }

    public static void main(String[] args) {
        ServiceNew serviceNew = new ServiceNew();
        Practise036 practise036 = new Practise036(serviceNew);
        practise036.start();
        Practise037 practise037 = new Practise037(serviceNew);
        practise037.start();
    }
}
