package org.practise.thread.api;

import java.util.Random;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 高优先级的线程总是大部分先执行完，但不代表高优先级的线程全部执行完之后低优先级的线程才开始执行。另外。高优先级的线程的运行速度快
 * @date 2020-11-16 10:36
 * @see
 */
public class Practise015 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult += i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("practise015耗时："+(endTime-beginTime)+"毫秒");
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Practise014 practise014 = new Practise014();
            practise014.setPriority(10);
            practise014.start();
            Practise015 practise015 = new Practise015();
            practise015.start();
        }
    }

}
