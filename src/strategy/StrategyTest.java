package strategy;

import strategy.impl.DaPengFly;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:41
 */
public class StrategyTest {
    public static void main(String[] args) {
        Dragon yiLongDragon = new YiLongDragon();
        yiLongDragon.performFly();
        yiLongDragon.live();

        Dragon sheJingLongDragon = new SheJingLongDragon();
        sheJingLongDragon.performSwim();
        sheJingLongDragon.live();

        Dragon daPengDragon = new DaPengDragon();
        //此处通过set方法可以动态的更改业务实现方法
        daPengDragon.setFlyBehavior(new DaPengFly());
        daPengDragon.performFly();
        daPengDragon.live();
    }
}
