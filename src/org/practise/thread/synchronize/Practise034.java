package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 20:33
 * @Version 1.0
 * @See
 */
public class Practise034 extends Thread {
    private TaskNew taskNew;

    public Practise034(TaskNew taskNew) {
        this.taskNew = taskNew;
    }

    @Override
    public void run() {
        super.run();
        taskNew.doLongTimeTask();
    }
}
