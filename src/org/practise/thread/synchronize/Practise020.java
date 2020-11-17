package org.practise.thread.synchronize;

/**
 * @author zhangshenming
 * @version 1.0
 * @description
 * 1、A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法；
 * 2、A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法，需要等待，也就是同步。
 * 3、在方法声明处添加synchronized并不是锁方法而是锁当前类的对象。
 * 4、在java中只有将对象作为锁，没有锁方法
 * 5、在java中，锁就是对象，对象可以映射成锁。也就是说哪个对象拿到这把锁，就可以执行这个对象中的synchronized同步方法
 * 6、如果在X对象中使用了synchronized关键字声明非静态方法，那么X对象就被当成了锁。
 * @date 2020-11-16 20:17
 * @see
 */
public class Practise020 extends Thread {
//     MyObject没有同步方法
//    private MyObject myObject;
//
//    public Practise020(MyObject myObject) {
//        this.myObject = myObject;
//    }

//    MyObject1中有同步方法
//    private MyObject1 myObject;
//
//    public Practise020(MyObject1 myObject) {
//        this.myObject = myObject;
//    }
    private MyObject2 myObject;

    public Practise020(MyObject2 myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodB();
    }
    /**
     * @Description 
     * @Author zhangshenming
     * @Date 2020/11/17  9:41
     * @param [args]
     * @return void
     */
    public static void main(String[] args) {
//      MyObject没有同步方法
//      MyObject myObject = new MyObject();
//      MyObject1中有同步方法
//      MyObject1 myObject = new MyObject1();
//      MyObject2中的有两个单独的非同步方法
        MyObject2 myObject = new MyObject2();
        Practise019 practise019 = new Practise019(myObject);
        practise019.setName("A");
        practise019.start();
        Practise020 practise020 = new Practise020(myObject);
        practise020.setName("B");
        practise020.start();
    }
}
