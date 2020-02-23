package 观察者模式;

/**
 * 瓜皮学生
 */
public class GuaPiAudience implements Audience {

    private Anchor anchor;

    public GuaPiAudience(Anchor anchor) {
        this.anchor = anchor;
    }

    @Override
    public void listen(String msg) {
        if (msg.contains("开播")) {
            sendBarrage("皮老师终于来了");
        }else if (msg.contains("LOL")) {
            sendBarrage("玩啥段位？");
        }else if (msg.contains("基地爆炸")) {
            sendBarrage("多捞哦");
        }else if (msg.contains("下播")) {
            sendBarrage("捞的嘛 不谈了");
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
        System.out.println("瓜皮学生:" + msg);
    }
}
