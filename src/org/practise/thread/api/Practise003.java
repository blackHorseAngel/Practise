package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 停止线程的方式
 * @date 2020-11-3 19:23
 * @see
 */
public class Practise003 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
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
        Practise003 test = new Practise003();
        test.start();
        try {
            test.sleep(1000);
            test.interrupt();
            if(test.isInterrupted()){
                System.out.println("zzzzzzzzzzzzzzz");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("线程已经被打断");
        }
    }
}
 