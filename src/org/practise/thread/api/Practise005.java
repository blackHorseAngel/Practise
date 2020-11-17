package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 第一次调用isinterrupted返回false是因为当前线程已经停止，第二次返回false是因为第一次调用的时候已经清除了中断的状态
 * @date 2020-11-15 20:30
 * @see
 */
public class Practise005 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000; i++) {
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
        Practise005 practise = new Practise005();
        practise.start();
        Thread.currentThread().interrupt();
        System.out.println("是否停止1："+Thread.interrupted());
        System.out.println("是否停止2："+Thread.interrupted());
        System.out.println("end!");
    }
}
