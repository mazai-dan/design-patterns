package pattern.decorator;

/**
 * 具体的构建角色
 */
public class ConcreteComponent implements Component{
    @Override
    public void doSomething() {
        System.out.println("功能A");
    }
}
