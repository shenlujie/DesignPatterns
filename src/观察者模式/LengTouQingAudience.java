package 观察者模式;

/**
 * 愣头青
 */
public class LengTouQingAudience implements Audience {
    private Anchor anchor;

    public LengTouQingAudience(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public void listen(String msg) {
        if (msg.contains("开播")) {
            sendBarrage("迟到了一分钟");
        }else if (msg.contains("LOL")) {
            sendBarrage("来波马氏回旋踢~");
        }else if (msg.contains("基地爆炸")) {
            sendBarrage("菜啊");
        }else if (msg.contains("下播")) {
            sendBarrage("明天几点开播啊");
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
        System.out.println("愣头青:" + msg);
    }
}
