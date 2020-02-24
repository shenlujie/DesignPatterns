package 策略模式;

public class RamAndroid8g implements RamSize {
    @Override
    public void bootAppCount() {
        System.out.println("Android 8g内存，可同时打开多个应用，流畅无压力");
    }
}
