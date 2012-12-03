package org.ib.designpatterns.gof.structural.facade;

/**
 * Created with IntelliJ IDEA.
 * User: ibrencsics
 * Date: 2012.12.03.
 * Time: 21:38
 * To change this template use File | Settings | File Templates.
 */

// Facade

class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load("BOOT_ADDRESS", hardDrive.read("BOOT_SECTOR", "SECTOR_SIZE"));
        cpu.jump("BOOT_ADDRESS");
        cpu.execute();
    }
}