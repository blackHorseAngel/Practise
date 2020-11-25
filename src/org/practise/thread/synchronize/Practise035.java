package org.practise.thread.synchronize;

/**
 * @Description synchronized代码块锁定当前对象
 * @Author zhangshenming
 * @Date 2020/11/20 20:34
 * @Version 1.0
 * @See
 */
public class Practise035 extends  Thread {

    private TaskNew taskNew;

    public Practise035(TaskNew taskNew) {
        this.taskNew = taskNew;
    }

    @Override
    public void run() {
        super.run();
        taskNew.doLongTimeTask();
    }

    public static void main(String[] args) {
        TaskNew taskNew = new TaskNew();
        try {
            Practise034 practise034 = new Practise034(taskNew);
            practise034.start();
            Thread.sleep(100);
            Practise035 practise035 = new Practise035(taskNew);
            practise035.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
