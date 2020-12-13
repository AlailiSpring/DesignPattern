package strategy.impl;

import strategy.itf.FlyBehavior;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:15
 */
public class ShyAnimalFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞行龙类当空翱翔！");
    }
}
