package 观察者模式;

/**
 * 观众
 */
public interface Audience {

    /**
     * 听主播说骚话
     * @param msg 骚话
     */
    void listen(String msg);

    /**
     * 订阅
     */
    void subscribe();

    /**
     * 取关
     */
    void unsubscribe();

    /**
     * 发弹幕
     * @param msg 弹幕
     */
    void sendBarrage(String msg);
}
