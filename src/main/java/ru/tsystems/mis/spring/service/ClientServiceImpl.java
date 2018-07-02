package ru.tsystems.mis.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tsystems.mis.spring.dao.ClientDAO;
import ru.tsystems.mis.spring.model.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    public int add(Client client) {
        return clientDAO.add(client);
    }

    public int update(Client client) {
        return clientDAO.update(client);
    }

    public int delete(Client client) {
        return clientDAO.delete(client);
    }

    public Client get(Long id) {
        return clientDAO.get(id);
    }

    public List<Client> list() {
        return clientDAO.list();
    }
}
