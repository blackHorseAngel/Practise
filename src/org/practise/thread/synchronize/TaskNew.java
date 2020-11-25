package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 20:30
 * @Version 1.0
 * @See
 */
public class TaskNew {
//
//    public void otherMethod(){
//        System.out.println("--------------run------method");
//    }
    synchronized public void otherMethod() {
        System.out.println("--------------run------method");
    }

    public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName:" + Thread.currentThread().getName() + ",i=" + (i + 1));
            }
        }
    }
}
