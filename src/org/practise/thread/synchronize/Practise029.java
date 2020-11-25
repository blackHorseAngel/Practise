package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/18 22:41
 * @Version 1.0
 * @See
 */
public class Practise029 extends  Thread {
    
    private Task task;

    public Practise029(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeWork();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }

    public static void main(String[] args) {
        Task task = new Task();
        Practise028 practise028 = new Practise028(task);
        practise028.start();
        Practise029 practise029 = new Practise029(task);
        practise029.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime1 > CommonUtils.beginTime2){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime1<CommonUtils.endTime2){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时："+(endTime-beginTime));
    }
}
