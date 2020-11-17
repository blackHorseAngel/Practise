package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-16 19:48
 * @see
 */
public class MyObject {
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
