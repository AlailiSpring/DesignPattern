package strategy;

/**
 * @Description:
 * @Author: LiBaoDeng
 * @Date: 2020-12-13 23:41
 */
public class StrategyTest {
    public static void main(String[] args) {
        Dragon yiLongDragon = new YiLongDragon();
        yiLongDragon.performFly();
        yiLongDragon.run();

        Dragon sheJingLongDragon = new SheJingLongDragon();
        sheJingLongDragon.performSwim();
        sheJingLongDragon.run();
    }
}
