package org.practise.thread.synchronize;

/**
 * @Description 当存在父子类继承关系时，子类完全可以通过锁重入调用父类的同步方法
 * @Author zhangshenming
 * @Date 2020/11/18 20:28
 * @Version 1.0
 * @See
 */
public class Practise022 extends Thread {
    @Override
    public void run() {
        super.run();
        Sub sub = new Sub();
        sub.operateSubMethod();
    }

    public static void main(String[] args) {
        Practise022 practise022 = new Practise022();
        practise022.start();
    }
}
