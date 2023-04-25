package Facade;

import Facade.Interfaces.IHardDrive;

public class MyHardDrive implements IHardDrive {
    public char[] read(long lba, int size) {
        return new char[size];
    }
}

