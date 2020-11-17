package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 测试守护线程。当最后一个用户线程销毁了，守护线程也就退出了，进程也随之结束。setDaemon方法需要在start方法前设置，否则会出异常。
 * @date 2020-11-16 10:43
 * @see
 */
public class Practise016 extends Thread{
    private int i = 0;
    @Override
    public void run() {
        super.run();
        while(true){
            i++;
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:48
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
        Practise016 practise = new Practise016();
        practise.setDaemon(true);
        practise.start();
        try {
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
