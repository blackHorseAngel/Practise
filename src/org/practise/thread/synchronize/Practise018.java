package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description hasSelfPrivateNum，practise017，practise018共同测试唯一实例变量，方法内部变量对线程安全的影响。为了保持线程安全和数据的一致性，需要在hasSelfPrivateNum的addI方法上加上synchronized关键字
 * @date 2020-11-16 12:07
 * @see
 */
public class Practise018 extends Thread{
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param 
     * @return 
     */
    private HasSelfPrivateNum1 numRef;

    public HasSelfPrivateNum1 getNumRef() {
        return numRef;
    }

    public void setNumRef(HasSelfPrivateNum1 numRef) {
        this.numRef = numRef;
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:41
     * @param [numRef]
     * @return 
     */
    public Practise018(HasSelfPrivateNum1 numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:41
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
//       一个对象对应多个线程，为了保持数据一致性和线程安全，需要使用synchronized关键字；
        /*HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        Practise017 practise017 = new Practise017(hasSelfPrivateNum);
        practise017.start();
        Practise018 practise018 = new Practise018(hasSelfPrivateNum);
        practise018.start();*/
//      多个对象对应多个线程，不存在竞争关系，可以不使用synchronized关键字
        HasSelfPrivateNum1 hasSelfPrivateNum1 = new HasSelfPrivateNum1();
        HasSelfPrivateNum1 hasSelfPrivateNum2 = new HasSelfPrivateNum1();
        Practise017 practise017 = new Practise017(hasSelfPrivateNum1);
        practise017.start();
        Practise018 practise018 = new Practise018(hasSelfPrivateNum2);
        practise018.start();
    }
}
