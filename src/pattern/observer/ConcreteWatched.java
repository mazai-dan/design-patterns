package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dan on 2019/5/10
 * 具体的主题角色
 */
public class ConcreteWatched implements Watched {

	/**
	 * 用于存放观察主题角色 的 观察者们！
	 */
	private List<Watcher> list = new ArrayList<>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String message) {
		list.forEach(v -> v.update(message));
	}
}
