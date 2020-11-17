package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description 使用synchronized关键字修改方法来实现数据一致性，保证线程安全
 * @date 2020-11-16 11:46
 * @see
 */
public class HasSelfPrivateNum2 {
//  变量num为该类实例变量
    private int num = 0;
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:40
     * @param [userName]
     * @return void
     */
    synchronized public void addI(String userName) {
        int num = 0;
        try {
            if(userName.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else{
                num = 200;
                System.out.println("b set over");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(userName+",num:"+num);
    }


}