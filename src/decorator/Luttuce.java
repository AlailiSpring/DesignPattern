package decorator;

/**
 * Created by AlailiSpring on 2017/4/16.
 */
public class Luttuce extends CondimentDecorator {
    Humburger humburger;

    public Luttuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }
}
