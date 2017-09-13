package decorator;

/**
 * Created by AlailiSpring on 2017/4/16.
 */
public class Chilli extends CondimentDecorator {
    Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+" 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();
    }
}
