package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/17 9:32
 * @Version 1.0
 * @See
 */
public class ServiceTest {
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 9:37 2020/11/17
     * @param []
     * @return void
     */
    synchronized public  void service1(){
        System.out.println("service1");
        service2();
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param []
     * @return void
     */
    synchronized public void service2() {
        System.out.println("service2");
        service3();
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param []
     * @return void
     */
    synchronized public void service3() {
        System.out.println("service3");
    }
}
