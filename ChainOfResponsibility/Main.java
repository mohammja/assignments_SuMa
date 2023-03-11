package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        YrityksenCEOHandler ceoHandler = new YrityksenCEOHandler();
        YksikonPaallikkoHandler paallikkoHandler = new YksikonPaallikkoHandler();
        EsimiesHandler esimiesHandler = new EsimiesHandler();

        esimiesHandler.setSuccessor(paallikkoHandler);
        paallikkoHandler.setSuccessor(ceoHandler);

        KorotusRequest request = new KorotusRequest(1);
        esimiesHandler.handleRequest(request);

        KorotusRequest request1 = new KorotusRequest(3);
        esimiesHandler.handleRequest(request1);

        KorotusRequest request2 = new KorotusRequest(6);
        esimiesHandler.handleRequest(request2);


        System.out.println("\nSecond way by using handlerManager......\n");
        //2. way while using handlerManager class:

        HandlerManager handlerManager = new HandlerManager();
        handlerManager.addHandler(new EsimiesHandler());
        handlerManager.addHandler(new YksikonPaallikkoHandler());
        handlerManager.addHandler(new YrityksenCEOHandler());

        handlerManager.handleRequest(request);


    }
}
