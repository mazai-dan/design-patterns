package pattern.decorator;

public class Client {
    public static void main(String[] args) {
        //类似于节点流
        Component component1 = new ConcreteComponent();
        //类似于过滤流
        Component component2 = new ConcreteDecorator1(component1);
        //类似于过滤流
        Component component3 = new ConcreteDecorator2(component2);

        component3.doSomething();

    }
}
