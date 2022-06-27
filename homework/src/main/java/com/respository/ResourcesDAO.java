package com.respository;

public class ResourcesDAO {
    private int Cpu, Memory, Disk;

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public int getDisk() {
        return Disk;
    }

    public void setDisk(int disk) {
        Disk = disk;
    }

    public int getCpu() {
        return Cpu;
    }

    public void setCpu(int cpu) {
        Cpu = cpu;
    }
}
