package 策略模式;

/**
 * 手机
 */
public abstract class MobliePhone {

    private CpuModel cpuModel;

    private RamSize ramSize;

    private RomCapacity romCapacity;

    private PxielModel pxielModel;

    public MobliePhone(CpuModel cpuModel, RamSize ramSize, RomCapacity romCapacity, PxielModel pxielModel) {
        this.cpuModel = cpuModel;
        this.ramSize = ramSize;
        this.romCapacity = romCapacity;
        this.pxielModel = pxielModel;
    }

    abstract void call();

    public void performance() {
        cpuModel.performance();
    }

    public void bootAppCount() {
        ramSize.bootAppCount();
    }

    public void storageCount() {
        romCapacity.storageCount();
    }

    public void photoQualitity() {
        pxielModel.photoQualitity();
    }
}
