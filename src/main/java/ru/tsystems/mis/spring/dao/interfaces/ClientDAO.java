package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Client;

import java.util.List;


public interface ClientDAO {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(Long id);

    Client getClientById(Long id);

    List<Client> listClients();
}
