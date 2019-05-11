package pattern.strategy;

public class GreenStrategy implements Strategy {

    @Override
    public void request() {
        System.out.println("green");
    }
}
