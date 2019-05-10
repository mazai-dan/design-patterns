package pattern.observer;

/**
 * Created by dan on 2019/5/10
 */
public class Test {
	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();

		Watcher boyFriend1 = new ConcreteWatcher();
		Watcher boyFriend2 = new ConcreteWatcher();
		Watcher boyFriend3 = new ConcreteWatcher();

		girl.addWatcher(boyFriend1);
		girl.addWatcher(boyFriend2);
		girl.addWatcher(boyFriend3);

		girl.notifyWatchers("男友们，我很开心！！！");

		girl.removeWatcher(boyFriend3);

		girl.notifyWatchers("我和男友3分手了！");
	}
}
