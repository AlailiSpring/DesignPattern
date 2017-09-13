package obServer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它了解观察（订阅）它的观察者，提供注册和删除功能
 * Created by AlailiSpring on 2016/12/22.
 */
public class Subject {
    /**
     * 保存注册的观察者对象
     */
    private List<Observer> observerList=new ArrayList<Observer>();

    /**
     * 注册观察者对象
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
    }

    /**
     * 移除观察者对象
     * @param observer
     */
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers(){
        for(Observer observer:observerList){
            observer.update(this);
        }
    }

}
