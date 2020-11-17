package org.practise.thread.api;

import java.util.Map;
import java.util.Set;

/**
 * @author zhangshenming
 * @version 1.0
 * @description getAllStackTrace返回所有活动线程的堆栈映射
 * @date 2020-11-3 17:55
 * @see
 */
public class Practise002 {
    /**
     * @Description
     * @Author zhangshenming
     * @Date 2020/11/17  9:42
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
    public  void d(){
        e();
    }
    /**
     * @Description
     * @Author zhangshenming
     * @Date 2020/11/17  9:42
     * @param []
     * @return void
     */
    public void e() {
        Map<Thread,StackTraceElement[]>map = Thread.getAllStackTraces();
        if(map!=null && map.size()!=0){
            Set<Thread> threadSet = map.keySet();
            for(Thread thread : threadSet){
                StackTraceElement[] stackTraceElement = map.get(thread);
                System.out.println("每个线程的基本信息，线程名称："+thread.getName()+",StackTraceElement长度："+stackTraceElement.length+",线程的状态："+thread.getState());
                if(stackTraceElement.length != 0){
                    System.out.println("输出StackTrackElement【】的基本信息：");
                    for(int i=0;i<stackTraceElement.length;i++){
                        StackTraceElement elemenet = stackTraceElement[i];
                        System.out.println("className:"+elemenet.getClassName()+",methodName:"+elemenet.getMethodName()+",fileName:"+elemenet.getFileName()+",lineNumber:"+elemenet.getLineNumber());
                    }
                }else{
                    System.out.println("没有stackTraceElement信息");
                }
            }
        }
    }
    /**
     * @Description
     * @Author zhangshenming
     * @Date 2020/11/17  9:43
     * @param
     * @return
     */
    public static void main(String[] args) {
        Practise002 test= new Practise002();
        test.a();
    }
}
