package Decorator;

public class Main {
    public static void main(String[] args) {
        Data myData = new MyData();
        Data protectedData = new AccessControlDecorator(myData, "password");


        try {
            System.out.println(protectedData.read());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}