package 抽象工厂模式;

public class JDMarket {
    public static void main(String[] args) {
        PhoneFactory samsungStore = new SamsungStore();
        samsungStore.order("QS855");

        PhoneFactory appleStore = new AppleStore();
        appleStore.order("A12");
    }
}
