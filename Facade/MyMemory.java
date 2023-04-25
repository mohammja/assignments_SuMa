package Facade;

import Facade.Interfaces.IMemory;

import java.util.Arrays;

public class MyMemory implements IMemory {

    private char[] data;

    @Override
    public void load(long position, char[] data) {
        this.data= Arrays.copyOf(data, data.length);
    }

    @Override
    public char[] getData() {
        return Arrays.copyOf(data, data.length);
    }
}

