package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 22:27
 * @Version 1.0
 * @See
 */
public class Practise040 extends Thread{

    private MyList myList;

    public Practise040(MyList myList) {
        this.myList = myList;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <10000; i++) {
            myList.add("threadA:"+(i+1));
        }
    }
}
