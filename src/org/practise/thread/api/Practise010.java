package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 将return和interrupt相结合也可以达到终止线程的目的
 * @date 2020-11-15 22:19
 * @see
 */
public class Practise010 extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了！");
                return;
            }
            System.out.println("timer:" + System.currentTimeMillis());
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
        Practise010 practise = new Practise010();
        practise.start();
        try {
            Thread.sleep(2000);
            practise.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
