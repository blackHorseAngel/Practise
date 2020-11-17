package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description yield方法是放弃当前的CPU资源，让其他的任务去占用CPU执行时间分片，放弃的时间不确定，有可能刚刚放弃马上又获得CPU时间分片。本例中循环变量只有大于50000000才能看到效果
 * @date 2020-11-15 22:31
 * @see
 */
public class Practise011 extends Thread{
    @Override
    public void run() {
        super.run();
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            //没有加上yield的时候，耗时20ms，加上以后，耗时20701毫秒，不过加上之后的运行时间不一定一直都是这个数，会有变化
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时："+(endTime-beginTime)+"毫秒");
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        Practise011 practise = new Practise011();
        practise.start();
    }
}
