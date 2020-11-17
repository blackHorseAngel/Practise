package org.practise.thread.api;

/**
 * @author zhangshenming
 * @version 1.0
 * @description dumpstack用来跟踪线程的堆栈信息
 * @date 2020-11-01 21:18
 * @see
 */
public class Practise001 {
/**
 * @Description 
 * @Author zhangshenming
 * @Date 2020/11/17  9:41
 * @param []
 * @return void
 */
 
    public void a(){
        b();
    }
/**
 * @Description 
 * @Author zhangshenming
 * @Date 2020/11/17  9:42
 * @param []
 * @return void
 */
    public void b() {
        c();
    }
/**
 * @Description 
 * @Author zhangshenming
 * @Date 2020/11/17  9:42
 * @param []
 * @return void
 */
    public void c() {
        d();
    }
/**
 * @Description 
 * @Author zhangshenming
 * @Date 2020/11/17  9:42
 * @param []
 * @return void
 */
    private void d() {
        e();
    }
/**
 * @Description 
 * @Author zhangshenming
 * @Date 2020/11/17  9:42
 * @param []
 * @return void
 */
    private void e() {
        int age = 100;
        if(age==100){
            Thread.dumpStack();
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
        Practise001 test = new Practise001();
        test.a();
    }
}
