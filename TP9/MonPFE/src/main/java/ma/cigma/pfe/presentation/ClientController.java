package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

import java.util.List;

public class ClientController {
    IClientService service;

    public ClientController(IClientService service) {
        this.service = service;
    }

    public void setService(IClientService service) {
        this.service = service;
    }

    public void save(Client c){
        service.save(c);
    }
    public void modify(Client c){
        service.modify(c);
    }
    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }
    public List<Client> getAll(){
        return service.getAll();
    }
    public ClientController(){
    }
}
