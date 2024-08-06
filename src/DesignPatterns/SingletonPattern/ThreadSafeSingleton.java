package DesignPatterns.SingletonPattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private final String url;
    private final String username;
    private final String password;

    private ThreadSafeSingleton(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static synchronized ThreadSafeSingleton getInstance(String url, String username, String password) {
        if (instance == null) {
            instance = new ThreadSafeSingleton(url, username, password);
        }
        return instance;
    }


    public String getUrl() {
        System.out.println(url);
        return url;
    }

    public String getUsername() {
        System.out.println(username);
        return username;
    }

    public String getPassword() {
        System.out.println(password);
        return password;
    }
}
