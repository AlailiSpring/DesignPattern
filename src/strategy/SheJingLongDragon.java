package strategy;

import strategy.impl.OceanAnimalSwim;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:48
 */
public class SheJingLongDragon extends Dragon {

    public SheJingLongDragon() {
        swimBehavior = new OceanAnimalSwim();
    }
    @Override
    public void live() {
        System.out.println("蛇颈龙捕捉海洋生物为生！");
    }
}
