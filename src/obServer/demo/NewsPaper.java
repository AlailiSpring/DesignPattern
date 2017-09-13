package obServer.demo;

import obServer.Subject;

/**
 * 报纸(目标对象)
 * Created by AlailiSpring on 2016/12/22.
 */
public class NewsPaper extends Subject {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyObservers();
    }
}
