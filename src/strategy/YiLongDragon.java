package strategy;

import strategy.impl.ShyAnimalFly;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:23
 */
public class YiLongDragon extends Dragon {
    public YiLongDragon() {
        flyBehavior = new ShyAnimalFly();
    }
    @Override
    public void live() {
        System.out.println("翼龙飞行捕捉猎物生存！");
    }

}
