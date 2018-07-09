package ru.tsystems.mis.spring.service.interfaces;

import ru.tsystems.mis.spring.model.Client;

import java.util.List;

public interface ClientService {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(Long id);

    Client getClientById(Long id);

    List<Client> listClients();
}
