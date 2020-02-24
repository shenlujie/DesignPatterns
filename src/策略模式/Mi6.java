package 策略模式;

public class Mi6 extends MobliePhone {

    public Mi6(CpuModel cpuModel, RamSize ramSize, RomCapacity romCapacity, PxielModel pxielModel) {
        super(cpuModel, ramSize, romCapacity, pxielModel);
    }

    @Override
    void call() {
        performance();
        bootAppCount();
        storageCount();
        photoQualitity();
        System.out.println("这就是一代经典小米6");
    }
}
