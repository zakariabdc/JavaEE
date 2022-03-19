package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.ClientServiceImpl;
import ma.cigma.pfe.service.IClientService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ClientDaoImpl implements IClientDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em = emf.createEntityManager();
    @Override
    public Client save(Client c){
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return null;
    }
}
