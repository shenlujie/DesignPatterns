package 策略模式;

public class OnePlus7Pro extends MobliePhone {

    public OnePlus7Pro(CpuModel cpuModel, RamSize ramSize, RomCapacity romCapacity, PxielModel pxielModel) {
        super(cpuModel, ramSize, romCapacity, pxielModel);
    }

    @Override
    void call() {
        performance();
        bootAppCount();
        storageCount();
        photoQualitity();
        System.out.println("这就是当今旗舰一加7Pro！");
    }
}
