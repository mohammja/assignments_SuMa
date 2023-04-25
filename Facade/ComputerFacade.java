package Facade;

import Facade.Interfaces.ICPU;
import Facade.Interfaces.IHardDrive;
import Facade.Interfaces.IMemory;

public class ComputerFacade {
    private ICPU processor;
    private IMemory ram;
    private IHardDrive hardDrive;

    private static final long BOOT_ADDRESS = 0;
    private static final long BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 512;

    public ComputerFacade() {
        this.processor = new MyCPU();
        this.ram = new MyMemory();
        this.hardDrive = new MyHardDrive();
    }

    public void start() {
        processor.freeze();
        char[] bootAddress = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);

        ram.load(BOOT_ADDRESS, bootAddress);
        System.out.println("Data loaded into RAM: " );
        char[] data = ram.getData();
        for (int i = 0; i < data.length; i++) {
            System.out.print("Address: " + (BOOT_ADDRESS + i) + " Data: " + data[i] + "\n");
        }
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }


}
