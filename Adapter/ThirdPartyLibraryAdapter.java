package Adapter;

public class ThirdPartyLibraryAdapter implements IMathLibrary{

    private ThirdPartyLibrary thirdPartyLibrary;

    public ThirdPartyLibraryAdapter(){
        this.thirdPartyLibrary = new ThirdPartyLibrary();
    }
    @Override
    public double calculate(double a, double b) {
        int result = this.thirdPartyLibrary.calculate((int) a, (int) b);
        return (double)result;
    }
}
