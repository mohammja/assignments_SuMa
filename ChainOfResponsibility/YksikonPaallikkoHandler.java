package ChainOfResponsibility;

public class YksikonPaallikkoHandler implements KorotusHandler {

    private KorotusHandler successor;

    @Override
    public void handleRequest(KorotusRequest request) {
        if (request.getKorotus() > 2 && request.getKorotus() <= 5) {
            System.out.println("Yksikön päällikkö: " + request.getKorotus() + "% korotus on hyväksytty.");
        }else if (successor != null) {
            successor.handleRequest(request);
        }
    }

    @Override
    public void setSuccessor(KorotusHandler successor) {
        this.successor = successor;
    }
}
