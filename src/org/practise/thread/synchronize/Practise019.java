package org.practise.thread.synchronize;

import java.security.PrivateKey;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-16 19:50
 * @see
 */
public class Practise019 extends Thread {
//    MyObject中的方法没有同步
//    private MyObject myObject;
//    public Practise019(MyObject myObject) {
//        this.myObject = myObject;
//    }
//    MyObject1中的方法为同步方法
//    private MyObject1 myObject;
//    public Practise019(MyObject1 myObject) {
//        this.myObject = myObject;
//    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:41
     * @param 
     * @return 
     */
    private  MyObject2 myObject;

    public Practise019(MyObject2 myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
