package pattern.observer;

/**
 * Created by dan on 2019/5/10
 * 具体的观察者角色
 */
public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String message) {
		System.out.println(message);
	}
}
