package cigma.pfe.presentation;

import cigma.pfe.models.Client;
import cigma.pfe.services.IClientService;

public class ClientController {
    IClientService IClientService;
    public ClientController(IClientService IClientService){
        this.IClientService = IClientService;
    }
    public Client save(Client c){
        return IClientService.save(c);
    }

    public IClientService getIClientService() {
        return IClientService;
    }
}
