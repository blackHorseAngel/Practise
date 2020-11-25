package org.practise.thread.synchronize;

/**
 * @Description 不在synchronized块中的代码异步执行，在synchronized块中的代码同步执行
 * @Author zhangshenming
 * @Date 2020/11/19 20:20
 * @Version 1.0
 * @See
 */
public class Practise031 extends Thread {

    private Task task;

    public Practise031(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeWorkNew();
    }

    public static void main(String[] args) {
        Task task = new Task();
        Practise030 practise030 = new Practise030(task);
        practise030.setName("A");
        practise030.start();
        Practise031 practise031 = new Practise031(task);
        practise031.setName("B");
        practise031.start();

    }
}
