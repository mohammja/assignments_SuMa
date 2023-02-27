package Decorator;

class MyData implements Data {
    private String data = "secret data";

    @Override
    public String read() {
        return data;
    }

}