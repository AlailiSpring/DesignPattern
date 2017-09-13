package decorator;

/**
 * Created by AlailiSpring on 2017/4/16.
 */
public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name= "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}
