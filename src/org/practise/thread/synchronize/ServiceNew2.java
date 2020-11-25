package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 22:02
 * @Version 1.0
 * @See
 */
public class ServiceNew2 {

    private String anyString = new String();

    public void methodA(){
        synchronized (anyString){
            System.out.println("a begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end");
        }
    }
    public synchronized void methodB(){
        System.out.println("b begin");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b end");
    }
}
