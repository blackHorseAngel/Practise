package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 22:39
 * @Version 1.0
 * @See
 */
public class TestService1 {
    /***
     *@description
     *@author zhangshenming
     *@param obj
     *@date 2020/12/2 12:29
     *@return void
     *@throws

     */
    public void testMethod1(Object obj){
        synchronized (obj){
            System.out.println("testMethod1----getLock---time:"+System.currentTimeMillis()+",threadName:"+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("testMethod1----releaseLock---time:"+System.currentTimeMillis()+",threadName:"+Thread.currentThread().getName());
        }
    }
}
