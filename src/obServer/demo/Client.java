package obServer.demo;

/**
 * Created by AlailiSpring on 2016/12/22.
 */
public class Client {

    public static void main(String[] args) {

        NewsPaper newsPaper=new NewsPaper();

        Reader reader1=new Reader();
        reader1.setName("Alaili Spring");

        Reader reader2=new Reader();
        reader2.setName("Bruce Lee");

        Reader reader3=new Reader();
        reader3.setName("Jack Chen");

        newsPaper.attach(reader1);
        newsPaper.attach(reader2);
        newsPaper.attach(reader3);

        newsPaper.setContent("今天的雾霾很大，大家注意出行防护！");

    }
}
