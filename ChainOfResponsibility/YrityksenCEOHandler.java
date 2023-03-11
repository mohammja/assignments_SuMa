package ChainOfResponsibility;

public class YrityksenCEOHandler implements KorotusHandler{
    private KorotusHandler successor;
    @Override
    public void handleRequest(KorotusRequest request) {

        if (request.getKorotus() > 5){
            System.out.println("CEO: " +request.getKorotus() + "% korotus on hyväksytty!...........\n");
        }else if (successor != null){
            System.out.println("hylätty");
            successor.handleRequest(request);
        }
    }

    @Override
    public void setSuccessor(KorotusHandler successor) {
        this.successor = successor;
    }
}
