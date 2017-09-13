package obServer;

/**
 * 观察者接口
 * Created by AlailiSpring on 2016/12/22.
 */
public interface Observer {
    /**
     * 更新的接口，根据目标对象更新自己
     * @param subject
     */
    public void update(Subject subject);
}
