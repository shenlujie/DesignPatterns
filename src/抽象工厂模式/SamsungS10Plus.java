package 抽象工厂模式;

public class SamsungS10Plus implements Phone {
    @Override
    public void design() {
        System.out.println("开始设计" + SamsungS10Plus.class.getSimpleName() + "...");
    }

    @Override
    public void produce() {
        System.out.println("开始制造" + SamsungS10Plus.class.getSimpleName() + "...");
    }

    @Override
    public void process() {
        System.out.println("开始加工" + SamsungS10Plus.class.getSimpleName() + "...");
    }

    @Override
    public void sale() {
        System.out.println("开始销售" + SamsungS10Plus.class.getSimpleName() + "...");
    }

    @Override
    public void welcome() {
        System.out.println("拿好您的手机，欢迎下次光临!");
    }
}
