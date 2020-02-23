package 抽象工厂模式;

public class IphoneSe implements Phone {
    @Override
    public void design() {
        System.out.println("开始设计" + IphoneSe.class.getSimpleName() + "...");
    }

    @Override
    public void produce() {
        System.out.println("开始制造" + IphoneSe.class.getSimpleName() + "...");
    }

    @Override
    public void process() {
        System.out.println("开始加工" + IphoneSe.class.getSimpleName() + "...");
    }

    @Override
    public void sale() {
        System.out.println("开始销售" + IphoneSe.class.getSimpleName() + "...");
    }

    @Override
    public void welcome() {
        System.out.println("拿好您的手机，欢迎下次光临!");
    }
}
