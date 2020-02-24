package 策略模式;

public class RamAndroid6g implements RamSize {
    @Override
    public void bootAppCount() {
        System.out.println("旗舰机中已经被淘汰，千元机主力运存");
    }
}
