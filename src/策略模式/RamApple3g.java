package 策略模式;

public class RamApple3g implements RamSize {
    @Override
    public void bootAppCount() {
        System.out.println("众所周知，苹果3g内存相当于Android8g");
    }
}
