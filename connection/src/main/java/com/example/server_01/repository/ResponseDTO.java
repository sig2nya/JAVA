package com.example.server_01.repository;

public class ResponseDTO {
    private int Cpu, Disk, Mem;

    public int getCpu() {
        return Cpu;
    }

    public void setCpu(int cpu) {
        Cpu = cpu;
    }

    public int getDisk() {
        return Disk;
    }

    public void setDisk(int disk) {
        Disk = disk;
    }

    public int getMem() {
        return Mem;
    }

    public void setMem(int mem) {
        Mem = mem;
    }
}
