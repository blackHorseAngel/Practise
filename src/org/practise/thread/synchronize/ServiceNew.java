package org.practise.thread.synchronize;

/**
 * @Description
 * @Author zhangshenming
 * @Date 2020/11/20 20:46
 * @Version 1.0
 * @See
 */
public class ServiceNew {

    private String usernameParam;

    private String passwordParam;
//  测试实例变量的同步
//    private String anyString = new String();

    public void setUserNamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString) {
                System.out.println("threadName:" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("threadName:" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
