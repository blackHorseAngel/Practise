package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/19 20:24
 * @Version 1.0
 * @See
 */
public class ObjectService {
    public void serviceMethodA(){
        synchronized (this){
            System.out.println("A begin time:"+System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A end time:"+System.currentTimeMillis());
        }
    }
    public void serviceMethodB(){
        synchronized (this){
            System.out.println("B begin time:"+System.currentTimeMillis());
            System.out.println("B end time:"+System.currentTimeMillis());
        }
    }


}
