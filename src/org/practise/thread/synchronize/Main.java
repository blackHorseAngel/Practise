package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 20:21
 * @Version 1.0
 * @See
 */
public class Main {
    public int i = 10;
    synchronized public void operationMainMethod(){
        try {
            i--;
            System.out.println("main print i = "+i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
