package ChainOfResponsibility;

public class    EsimiesHandler implements KorotusHandler {
    private KorotusHandler successor;

    @Override
    public void handleRequest(KorotusRequest request) {
        if (request.getKorotus() <= 2) {
            System.out.println("Esimies: " + request.getKorotus() + "% Korotus on hyväksytty");
        }else if (successor != null) {
            System.out.println("Ohjataan korotuspyyntö yksikön päällikkölle!...........\n");
            successor.handleRequest(request);
        }
    }

    @Override
    public void setSuccessor(KorotusHandler successor) {
        this.successor = successor;
    }
}
