package obServer.demo;

import obServer.Observer;
import obServer.Subject;

/**
 * 读者(观察者对象)
 * Created by AlailiSpring on 2016/12/22.
 */
public class Reader implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name+" 收到订阅的报纸更新，更新的内容是=========="+
                ((NewsPaper)subject).getContent());
    }
}
