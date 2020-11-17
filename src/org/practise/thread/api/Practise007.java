package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 通过异常来终止线程的运行。本例总循环变量只有大于500000以后，才能看到现象
 * @date 2020-11-15 20:50
 * @see
 */
public class Practise007 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()){
                    System.out.println("已经是停止状态了，我要退出了！");
//                break;
                    throw new InterruptedException();
                }
                System.out.println("i="+(i+1));
            }
            System.out.println("我被输出，如果后面还有代码还会继续执行。线程并没有停止！");
        } catch (InterruptedException e) {
            System.out.println("进入Practise007");
            e.printStackTrace();
        }
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:47
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        Practise007 practise = new Practise007();
        practise.start();
        try {
            Thread.sleep(1000);
            practise.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
