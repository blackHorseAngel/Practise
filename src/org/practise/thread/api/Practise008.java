package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 线程在sleep状态下停止，那么会进入catch语句，并且清除停止状态
 * @date 2020-11-15 22:01
 * @see
 */
public class Practise008 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin!");
            Thread.sleep(20000);
            System.out.println("run end!");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch."+this.isInterrupted());
            e.printStackTrace();
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
        Practise008 practise = new Practise008();
        practise.start();
        try {
            Thread.sleep(200);
            practise.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
