package Facade.Interfaces;

public interface IMemory {
    public void load(long position, char[] data);
    char[] getData();
}
