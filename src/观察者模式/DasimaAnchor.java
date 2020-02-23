package 观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 金牌讲师
 */
public class DasimaAnchor implements Anchor {
    private List<Audience> audienceList = new ArrayList<>();

    @Override
    public void subscibe(Audience audience) {
        audienceList.add(audience);
    }

    @Override
    public void unsubscribe(Audience audience) {
        audienceList.remove(audience);
    }

    @Override
    public void announceAll(String msg) {
        audienceList.forEach(audience -> audience.listen(msg));
    }

    public void startShow() {
        System.out.println("大司马：同学们，老马来了，三点准时开播，不会迟到的");
        announceAll("同学们，老马来了，三点准时开播，不会迟到的");
    }

    public void startLol() {
        System.out.println("大司马：不行不行，开始搞LOL了，来把盲僧");
        announceAll("不行不行，开始搞LOL了，来把盲僧");
    }

    public void fail() {
        System.out.println("大司马：翻皮水了，基地爆炸，问题不大！溜了溜了");
        announceAll("翻皮水了，基地爆炸，问题不大！溜了溜了");
    }

    public void over() {
        System.out.println("大司马：同学们，帅气下播！");
        announceAll("同学们，帅气下播！");
    }
}
