package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * @date 2020-11-16 19:42
 * @see
 */
public class HasSelfPrivateNum0 {
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param [userName]
     * @return void
     */
    public void addI(String userName){
        int num = 0;
        if(userName.equals("a")){
            num = 100;
            System.out.println("a set over");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            num = 200;
            System.out.println("b set over");
        }
        System.out.println(userName+",num："+num);
    }
}
