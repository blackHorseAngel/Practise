package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-15 20:38
 * @see
 */
public class Practise006 extends Thread{
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
        Practise006 practise = new Practise006();
        try {
            practise.start();
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
