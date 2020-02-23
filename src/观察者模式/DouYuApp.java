package 观察者模式;


/**
 * 斗鱼app，老马直播间
 */
public class DouYuApp {
    public static void main(String[] args) throws InterruptedException {
        // 大司马入驻斗鱼
        DasimaAnchor anchor = new DasimaAnchor();

        // 观众们开始关注订阅
        Audience guaPiAudience = new GuaPiAudience(anchor);
        guaPiAudience.subscribe();
        Audience shiLeZhiAudience = new ShiLeZhiAudience(anchor);
        shiLeZhiAudience.subscribe();
        Audience lengTouQingAudience = new LengTouQingAudience(anchor);
        lengTouQingAudience.subscribe();

        // 大司马开播的一天
        anchor.startShow();
        Thread.sleep(2000);
        anchor.startLol();
        Thread.sleep(2000);
        anchor.fail();
        Thread.sleep(2000);
        anchor.over();
    }
}
