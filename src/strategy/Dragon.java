package strategy;

import strategy.itf.FlyBehavior;
import strategy.itf.SwimBehavior;

/**
 * @Description:基础类
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:04
 */
public  abstract class Dragon {

    FlyBehavior flyBehavior;

    SwimBehavior swimBehavior;

    public void performSwim() {
        swimBehavior.swim();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public abstract void live();

    public void run(){
        this.live();
        System.out.println("All dragons can run~");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
