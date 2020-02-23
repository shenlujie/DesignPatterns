package 观察者模式;

/**
 * 主播
 */
public interface Anchor {
    /**
     * 订阅
     * @param audience 观众
     */
    void subscibe(Audience audience);

    /**
     * 取关
     * @param audience 观众
     */
    void unsubscribe(Audience audience);

    /**
     * 说骚话
     * @param msg 骚话
     */
    void announceAll(String msg);
}
