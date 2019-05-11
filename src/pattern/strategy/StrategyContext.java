package pattern.strategy;

public class StrategyContext {

   private Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void request(){
        strategy.request();
    }
}
