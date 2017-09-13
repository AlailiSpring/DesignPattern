package obServer;

/**
 * 具体的观察者对象，实现更新的方法，使自身状态和目标的状态保持一致
 * Created by AlailiSpring on 2016/12/22.
 */
public class ConcreteObserver implements Observer {

    private String observerState;

    /**
     * 具体的实现
     * 保持自身的状态和目标对象一致
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getSubjectState();
    }
}
