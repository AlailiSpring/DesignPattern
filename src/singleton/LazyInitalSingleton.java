package singleton;

/**
 * 优雅的单例模式,解决同步的问题,利用了类级内部类
 * Created by AlailiSpring on 2016/12/6.
 */
public class LazyInitalSingleton {

    private static class BeautifulSingleHolder{

        private static LazyInitalSingleton lazyInitalSingleton=new LazyInitalSingleton();
    }

    private LazyInitalSingleton() {
    }

    private LazyInitalSingleton getInstance(){
        return BeautifulSingleHolder.lazyInitalSingleton;
    }
}
