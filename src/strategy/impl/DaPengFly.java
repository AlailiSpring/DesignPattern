package strategy.impl;

import strategy.DaPengDragon;
import strategy.itf.FlyBehavior;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:39
 */
public class DaPengFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("大鹏一跃九万里～");
    }
}
