package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/19 20:17
 * @Version 1.0
 * @See
 */
public class Practise030 extends Thread{

    private Task task;

    public Practise030(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeWorkNew();
    }
}
