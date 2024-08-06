package DesignPatterns.SingletonPattern;

public class Client {
    public static void main(String[] args) {

        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("jdbc:mysql://localhost:3306/mydb", "user", "password");
        threadSafeSingleton.getUrl();
        threadSafeSingleton.getUsername();
        threadSafeSingleton.getPassword();

        DoubleCheckedSingleton doubleCheckedSingleton = DoubleCheckedSingleton.getInstance("jdbc:mysql://localhost:3306/mydb", "user", "password");
        doubleCheckedSingleton.getUrl();
        doubleCheckedSingleton.getUsername();
        doubleCheckedSingleton.getPassword();
        System.out.println(doubleCheckedSingleton);

        DoubleCheckedSingleton singleton = DoubleCheckedSingleton.getInstance("jdbc:mysql://localhost:3306/mydb", "user", "password");
        MyThread t1 = new MyThread(singleton);
        MyThread t2 = new MyThread(singleton);
        MyThread t3 = new MyThread(singleton);
        t1.start();
        t2.start();
        t3.start();
    }
}
