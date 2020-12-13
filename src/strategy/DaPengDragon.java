package strategy;

import strategy.impl.ShyAnimalFly;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:54
 */
public class DaPengDragon extends Dragon {
    public DaPengDragon() {
        flyBehavior = new ShyAnimalFly();
    }
    @Override
    public void live() {
        System.out.println("神兽吸食日月精华！");
    }
}
