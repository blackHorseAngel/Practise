package org.practise.thread.synchronize;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 22:22
 * @Version 1.0
 * @See
 */
public class MyList {

    private List list = new ArrayList<>();

    synchronized public void add(String username){
        System.out.println("ThreadName:"+Thread.currentThread().getName()+"执行了add方法");
        list.add(username);
        System.out.println("ThreadName:"+Thread.currentThread().getName()+"退出了add方法");
    }
    synchronized public int getSize(){
        System.out.println("ThreadName:"+Thread.currentThread().getName()+"执行了getSize方法");
        int size = list.size();
        System.out.println("ThreadName:"+Thread.currentThread().getName()+"退出了getSize方法");
        return size;
    }
}
