package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 测试使用类对象实例的isinterrupted函数的返回值无法证明当前线程时候停止，因为守护线程一直在运行
 * @date 2020-11-15 20:15
 * @see
 */
public class Practise004 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 50000; i++) {
            System.out.println("i="+(i+1));
        }
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:47
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        Practise004 practise = new Practise004();
        practise.start();
        try {
            Thread.sleep(1000);
            practise.interrupt();
            System.out.println("是否停止1："+practise.isInterrupted());
            System.out.println("是否停止2："+practise.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
