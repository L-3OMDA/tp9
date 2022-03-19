package cigma.pfe.dao;

import cigma.pfe.models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoImpl implements IClientDao {
    IClientDao iClientDao;
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();



    @Override
    public Client save(Client c) {
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
        return null;
    }

    public ClientDaoImpl(IClientDao iClientDao){
        this.iClientDao=iClientDao;
    }

    public ClientDaoImpl(){}

    public IClientDao getIClientDao() {
        return iClientDao;
    }
}
