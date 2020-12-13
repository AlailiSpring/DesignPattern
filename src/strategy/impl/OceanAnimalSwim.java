package strategy.impl;

import strategy.itf.SwimBehavior;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:16
 */
public class OceanAnimalSwim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("海洋生物大海畅游！");
    }
}
