package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-16 21:19
 * @see
 */
public class MyObject2 {
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param []
     * @return void
     */
    public void methodA(){
        System.out.println("begin methodA threadName:"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("methodA end");
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param []
     * @return void
     */
    public void methodB(){
        System.out.println("begin methodB threadName:"+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("methodsB end");
    }
}
