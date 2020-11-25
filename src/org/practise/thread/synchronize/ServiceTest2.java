package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 20:37
 * @Version 1.0
 * @See
 */
public class ServiceTest2 {
    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("a")){
            System.out.println("ThreadName:"+Thread.currentThread().getName()+",run beginTime:"+System.currentTimeMillis());
            while (true){
                if(String.valueOf(Math.random()).substring(0,8).equals("0.123456")){
                    System.out.println("ThreadName:"+Thread.currentThread().getName()+",run exceptionTime:"+System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else {
            System.out.println("Thread B run time:"+System.currentTimeMillis());
        }
    }

}
