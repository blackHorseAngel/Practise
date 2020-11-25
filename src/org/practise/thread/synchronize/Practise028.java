package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 22:40
 * @Version 1.0
 * @See
 */
public class Practise028 extends Thread{
    private Task task;

    public Practise028(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeWork();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
