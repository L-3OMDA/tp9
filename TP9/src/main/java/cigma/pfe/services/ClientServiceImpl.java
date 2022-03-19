package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.dao.IClientDao;

public class ClientServiceImpl implements IClientService {
    IClientDao iClientDao;

    @Override
    public Client save(Client c) {
        return iClientDao.save(c);
    }

    public ClientServiceImpl(IClientDao IClientDao){
        this.iClientDao = IClientDao;
    }

    public IClientDao getiClientDao() {
        return iClientDao;
    }
}
