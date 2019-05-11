package pattern.strategy;

public class RedStrategy implements Strategy {
    @Override
    public void request() {
        System.out.println("red");
    }
}
