package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/19 20:27
 * @Version 1.0
 * @See
 */
public class Practise032 extends Thread{

    private  ObjectService objectService;

    public Practise032(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodA();
    }
}
