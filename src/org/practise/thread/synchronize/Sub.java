package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 20:23
 * @Version 1.0
 * @See
 */
public class Sub extends Main {
    synchronized public void operateSubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
