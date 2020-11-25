package org.practise.thread.synchronize;

/**
 * @Description 同步代码块放在非同步的synchronized方法中进行生命，并不保证调用方法的线程的执行同步（顺序性），线程调用方法的顺序是无序的，虽然在同步块中执行的顺序是同步的。
 * @Author zhangshenming
 * @Date 2020/11/20 22:28
 * @Version 1.0
 * @See
 */
public class Practise041 extends Thread{

    private MyList myList;

    public Practise041(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            myList.add("threadB:"+(i+1));
        }
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        Practise040 practise040 = new Practise040(myList);
        practise040.start();
        Practise041 practise041 = new Practise041(myList);
        practise041.start();
    }
}
