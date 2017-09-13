package decorator;

/**
 * Created by AlailiSpring on 2017/4/16.
 */
public abstract class Humburger {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
