package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Client;

import java.util.List;


public interface ClientDAO {
    int add(Client client);

    int update(Client client);

    int delete(Client client);

    Client get(Long id);

    List<Client> list();
}
