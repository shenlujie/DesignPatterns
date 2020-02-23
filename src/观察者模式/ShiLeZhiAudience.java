package 观察者模式;

/**
 * 石乐志
 */
public class ShiLeZhiAudience implements Audience {

    private Anchor anchor;

    public ShiLeZhiAudience(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public void listen(String msg) {
        if (msg.contains("开播")) {
            sendBarrage("迟到了迟到了");
        }else if (msg.contains("LOL")) {
            sendBarrage("来把亚索？");
        }else if (msg.contains("基地爆炸")) {
            sendBarrage("这队友孤儿队友");
        }else if (msg.contains("下播")) {
            sendBarrage("溜了溜了");
        }
    }

    @Override
    public void subscribe() {
        anchor.subscibe(this);
    }

    @Override
    public void unsubscribe() {
        anchor.unsubscribe(this);
    }

    @Override
    public void sendBarrage(String msg) {
        System.out.println("石乐志:" + msg);
    }
}
