package pattern.strategy;

public class Test {

    public static void main(String[] args) {
        RedStrategy redStrategy = new RedStrategy();
        StrategyContext strategyContext = new StrategyContext(redStrategy);

        strategyContext.request();
    }
}
