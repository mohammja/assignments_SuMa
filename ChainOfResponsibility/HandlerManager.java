package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class HandlerManager {
    private List<KorotusHandler> handlers = new ArrayList<>();

    public void addHandler(KorotusHandler handler){
        handlers.add(handler);
    }

    public void handleRequest(KorotusRequest request){
        for(KorotusHandler handler : handlers){
            handler.handleRequest(request);
        }
    }
}
