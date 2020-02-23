package 抽象工厂模式;

public interface PhoneFactory {

    Phone createPhone(String cpuType);

    default void order(String cpuType) {
        Phone phone = createPhone(cpuType);
        phone.design();
        phone.produce();
        phone.process();
        phone.sale();
        phone.welcome();
    }
}
