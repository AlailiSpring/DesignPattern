package decorator;

import java.util.logging.Level;

/**
 * Created by AlailiSpring on 2017/4/16.
 */
public class Test {

    public static void main(String[] args) {

        Humburger humburger = new ChickenBurger();

        System.out.println(humburger.getName()+" 价钱 "+humburger.getPrice());

        Luttuce luttuce = new Luttuce(humburger);

        System.out.println(luttuce.getName()+" 价钱 "+luttuce.getPrice());

        Chilli chilli = new Chilli(humburger);

        System.out.println(chilli.getName()+" 价钱 "+chilli.getPrice());

        Chilli chilli1 = new Chilli(luttuce);

        System.out.println(chilli.getName()+" 价钱 "+chilli1.getPrice());
    }
}
