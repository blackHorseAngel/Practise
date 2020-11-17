package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 使用synchronized同步块来实现数据一致性，保证线程安全
 * @date 2020-11-16 19:31
 * @see
 */
public class HasSelfPrivateNum3 {
    /**
     * @Description
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param
     * @return
     */
    public void addI(String userName) {
        synchronized (this) {
            int num = 0;
            try {
                if (userName.equals("a")) {
                    num = 100;
                    System.out.println("a set over");
                    Thread.sleep(2000);
                } else {
                    num = 200;
                    System.out.println("b set over");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(userName + ",num:" + num);
        }
    }
}
