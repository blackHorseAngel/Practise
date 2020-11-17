package org.practise.thread.api;

import java.util.Random;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 和practise015一起完成测试线程优先级的随机性的操作
 * @date 2020-11-16 10:29
 * @see
 */
public class Practise014 extends  Thread {
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
        System.out.println("Practise014耗时："+(endTime-beginTime)+"毫秒！");
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        Practise014 practise = new Practise014();
        practise.start();
    }
}
