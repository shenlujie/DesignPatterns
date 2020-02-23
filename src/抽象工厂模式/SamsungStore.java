package 抽象工厂模式;

public class SamsungStore implements PhoneFactory {

    @Override
    public Phone createPhone(String cpuType) {
        switch (cpuType) {
            case "QS855":
                return new SamsungS10Plus();
            case "QS865":
                return new SamsungS20();
            default:
                throw new RuntimeException("本店暂未出售搭载该芯片的商品!");
        }
    }
}
