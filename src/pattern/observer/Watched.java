package pattern.observer;

/**
 * Created by dan on 2019/5/10
 * 主题角色
 */
public interface Watched {
	/**
	 * 添加观察角色
	 *
	 * @param watcher 观察角色
	 */
	public void addWatcher(Watcher watcher);

	/**
	 * 移除观察角色
	 *
	 * @param watcher 观察角色
	 */
	public void removeWatcher(Watcher watcher);

	/**
	 * 通知观察角色
	 *
	 * @param message
	 */
	public void notifyWatchers(String message);
}
