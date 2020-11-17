package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 查看线程的优先级
 * @date 2020-11-16 10:03
 * @see
 */
public class Practise012 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Practise012的优先级是："+this.getPriority());

    }
}
