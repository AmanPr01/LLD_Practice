package DesignPatterns.SingletonPattern;

public class MyThread extends Thread {

    DoubleCheckedSingleton singleton;

    public MyThread(DoubleCheckedSingleton singleton) {
        this.singleton = singleton;
    }

    public void run() {
        System.out.println(singleton);
    }
}
