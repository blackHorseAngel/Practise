package org.practise.thread.synchronize;

/**
 * @Description Thread.holdLock(Object obj)的方法的作用是当currentThread在指定的对象上保持锁定时返回true
 * @Author zhangshenming
 * @Date 2020/11/18 22:04
 * @Version 1.0
 * @See
 */
public class Practise027 {
    public static void main(String[] args) {
        System.out.println("A:"+Thread.holdsLock(Practise027.class));
        synchronized (Practise027.class){
            System.out.println("B:"+Thread.holdsLock(Practise027.class));
        }
        System.out.println("C:"+Thread.holdsLock(Practise027.class));
    }
}
