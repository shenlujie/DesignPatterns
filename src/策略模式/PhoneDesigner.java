package 策略模式;

/**
 * 手机设计
 */
public class PhoneDesigner {
    public static void main(String[] args) {
        // 一加七Pro
        CpuModel cpu855 = new Cpu855();
        RamSize ramAndroid8g = new RamAndroid8g();
        RomCapacity rom128g = new Rom128g();
        PxielModel pxielBig = new PxielBig();
        MobliePhone onePlus7Pro = new OnePlus7Pro(cpu855, ramAndroid8g, rom128g, pxielBig);
        onePlus7Pro.call();

        // 小米6
        CpuModel cpu835 = new Cpu835();
        RamSize ramAndroid6g = new RamAndroid6g();
        RomCapacity rom64g = new Rom64g();
        PxielModel pxielSmall = new PxielSmall();
        MobliePhone mi6 = new Mi6(cpu835, ramAndroid6g, rom64g, pxielSmall);
        mi6.call();
    }
}
