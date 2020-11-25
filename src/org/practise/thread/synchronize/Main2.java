package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 21:47
 * @Version 1.0
 * @See
 */
public class Main2 {
    synchronized public void serviceMethod(){
        System.out.println("000--int main 下一步 sleep begin threadName："+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("000--int main 下一步 sleep end threadName:"+Thread.currentThread().getName()+",time:"+System.currentTimeMillis());

    }
}
