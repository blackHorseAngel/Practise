package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 21:50
 * @Version 1.0
 * @See
 */
public class Sub2 extends Main2{
    @Override
    public synchronized void serviceMethod() {
        System.out.println("000--int sub 下一步 sleep begin threadName:"+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("000--int sub 下一步 sleep end threadName:"+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());
    }
    public void serviceMethod1(){
        System.out.println("111--int sub 下一步 sleep begin threadName:"+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("111--int sub 下一步 sleep end threadName:"+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());
    }
}
