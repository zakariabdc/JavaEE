package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {
    ClientRepositoryImpl clientRepository;

    @Override
    public Client save(Client c) {
        System.out.println("DAO Layer: ClientRepositoryImpl Level");
        return null;
    }
    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepository...");
    }
}
