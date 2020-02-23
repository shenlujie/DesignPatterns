package 抽象工厂模式;

public class IphoneXr implements Phone {
    @Override
    public void design() {
        System.out.println("开始设计" + IphoneXr.class.getSimpleName() + "...");
    }

    @Override
    public void produce() {
        System.out.println("开始制造" + IphoneXr.class.getSimpleName() + "...");
    }

    @Override
    public void process() {
        System.out.println("开始加工" + IphoneXr.class.getSimpleName() + "...");
    }

    @Override
    public void sale() {
        System.out.println("开始销售" + IphoneXr.class.getSimpleName() + "...");
    }

    @Override
    public void welcome() {
        System.out.println("拿好您的手机，欢迎下次光临!");
    }
}
