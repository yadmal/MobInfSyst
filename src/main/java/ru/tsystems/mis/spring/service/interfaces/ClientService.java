package ru.tsystems.mis.spring.service.interfaces;

import ru.tsystems.mis.spring.model.Client;

import java.util.List;

/**
 * Service class for {@link Client}
 *
 * @author Dmitry Yashkin
 * @version 1.0
 */

public interface ClientService {
    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(Long id);

    Client getClientById(Long id);

    Client getClientByUsername(String username);

    List<Client> listClients();
}
