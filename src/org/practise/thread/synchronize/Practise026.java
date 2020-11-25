package org.practise.thread.synchronize;

/**
 * @Description 重写方法如果不使用synchronized关键字，是非同步方法，使用后子类的该方法才是同步方法
 * @Author zhangshenming
 * @Date 2020/11/18 21:54
 * @Version 1.0
 * @See
 */
public class Practise026 extends Thread{
    private Sub2 sub;

    public Practise026(Sub2 sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        super.run();
//      sub.serviceMethod();
        sub.serviceMethod1();
    }

    public static void main(String[] args) {
        Sub2 sub = new Sub2();
        Practise025 practise025 = new Practise025(sub);
        practise025.setName("A");
        practise025.start();
        Practise026 practise026 = new Practise026(sub);
        practise026.setName("B");
        practise026.start();
    }
}
