package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 22:19
 * @Version 1.0
 * @See
 */
public class Task {

    private String getData1;

    private String getData2;
//        synchronized同步方法的方式来保证同步
    /*    public synchronized void doLongTimeWork(){
            System.out.println("begin task");
            try {
                Thread.sleep(3000);
                getData1 = "长时间处理任务后从远程返回值1 threadName="+Thread.currentThread().getName();
                getData2 = "长时间处理任务后从远程返回值2 threadName="+Thread.currentThread().getName();
                System.out.println(getData1);
                System.out.println(getData2);
                System.out.println("end task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
//    synchronized同步代码块的方式才保证同步
    /*public void doLongTimeWork(){
        synchronized (this){
            System.out.println("begin task");
            try {
                Thread.sleep(3000);
                getData1 = "长时间处理任务后从远程返回值1 threadName="+Thread.currentThread().getName();
                getData2 = "长时间处理任务后从远程返回值2 threadName="+Thread.currentThread().getName();
                System.out.println(getData1);
                System.out.println(getData2);
                System.out.println("end task");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
//    synchronized同步代码块的升级版
    public void doLongTimeWork() {

            System.out.println("begin task");
            try {
                Thread.sleep(3000);
                String privateGetData1 = "长时间处理任务后从远程返回值1 threadName=" + Thread.currentThread().getName();
                String privateGetData2 = "长时间处理任务后从远程返回值2 threadName=" + Thread.currentThread().getName();
                synchronized (this) {
                    getData1 = privateGetData1;
                    getData1 = privateGetData2;
                    System.out.println(getData1);
                    System.out.println(getData2);
                    System.out.println("end task");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public void doLongTimeWorkNew(){
        for (int i = 0; i < 100; i++) {
            System.out.println("noSynchronized threadName:"+Thread.currentThread().getName());
        }
        System.out.println();
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName:"+Thread.currentThread().getName());
            }
        }
    }
}
