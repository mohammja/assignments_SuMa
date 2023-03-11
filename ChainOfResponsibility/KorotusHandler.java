package ChainOfResponsibility;

public interface KorotusHandler {

    public void handleRequest(KorotusRequest request);

    public void setSuccessor(KorotusHandler successor);
}
