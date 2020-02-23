package 抽象工厂模式;

public class AppleStore implements PhoneFactory {

    @Override
    public Phone createPhone(String cpuType) {
        switch (cpuType) {
            case "A9":
                return new IphoneSe();
            case "A12":
                return new IphoneXr();
            default:
                throw new RuntimeException("本店暂未出售搭载该芯片的商品!");
        }
    }
}
