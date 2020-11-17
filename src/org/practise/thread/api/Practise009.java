package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 先调用interrupt方法再调用sleep方法也会产生异常
 * @date 2020-11-15 22:09
 * @see
 */
public class Practise009 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            System.out.println("i="+(i+1));
        }
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止再遇到sleep进入catch");
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
        Practise009 practise = new Practise009();
        practise.start();
        practise.interrupt();
        System.out.println("end!");
    }
}
