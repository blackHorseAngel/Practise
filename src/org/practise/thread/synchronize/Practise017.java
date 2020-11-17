package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-16 11:58
 * @see
 */
public class Practise017 extends Thread{
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param 
     * @return 
     */
    private  HasSelfPrivateNum1 numRef1;
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:41
     * @param [numRef1]
     * @return 
     */
    public Practise017(HasSelfPrivateNum1 numRef1) {
        this.numRef1 = numRef1;
    }

    @Override
    public void run() {
        super.run();
        numRef1.addI("a");
    }
}
