package singleton;

/**
 * 懒汉单例模式
 * Created by AlailiSpring on 2016/11/24.
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 singleton1 = null;

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
