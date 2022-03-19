package ma.cigma.pfe.service;


import ma.cigma.pfe.dao.ClientDaoImpl;
import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

import java.util.List;

public class ClientServiceImpl implements IClientService {
    IClientDao dao;

    public ClientServiceImpl(IClientDao dao) {
        this.dao = dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public Client save(Client c) {
        return dao.save(c);
    }

    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }

    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return dao.findAll();
    }

    public ClientServiceImpl(){
    }
}
