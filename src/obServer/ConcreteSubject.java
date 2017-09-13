package obServer;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象
 * 在自身状态发生改变的时候，通知各个观察者
 * Created by AlailiSpring on 2016/12/22.
 */
public class ConcreteSubject extends Subject {

    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //状态发生改变，通知观察者
        this.notifyObservers();
    }
}
