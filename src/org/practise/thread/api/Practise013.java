package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 在操作系统中线程可以划分优先级，优先级高的线程得到的CPU资源多。CPU邮箱执行高优先级线程中的任务。java中的线程优先级从1~10.默认的3个优先级分别是最低优先级1，最高优先级10.正常优先级5.优先级具有继承性
 * @date 2020-11-16 10:07
 * @see
 */
public class Practise013 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Practise013的线程优先级是："+this.getPriority());
        Practise012 practise012 = new Practise012();
        practise012.setPriority(9);
        practise012.start();
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        System.out.println("main thread priority begin:"+Thread.currentThread().getPriority());
        //如果在含有线程的类实例化之前改变线程优先级，那么实例化的时候会按照修改之后的优先级进行运行，如果是在实例化之后再修改线程优先级，那么只有main线程改为新的优先级，而其他的线程维持原来的优先级
//        Thread.currentThread().setPriority(7);
        Practise013 practise = new Practise013();
        practise.setPriority(6);
        practise.start();
//        Thread.currentThread().setPriority(7);
        System.out.println("main thread priority end:"+Thread.currentThread().getPriority());
    }
}
