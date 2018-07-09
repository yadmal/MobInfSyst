package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ClientDAO;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.service.interfaces.ClientService;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDAO clientDAO;

    @Override
    @Transactional
    public void addClient(Client client) {
        clientDAO.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        clientDAO.updateClient(client);
    }

    @Override
    @Transactional
    public void deleteClient(Long id) {
        clientDAO.deleteClient(id);
    }

    @Override
    @Transactional
    public Client getClientById(Long id) {
        return clientDAO.getClientById(id);
    }

    @Override
    @Transactional
    public List<Client> listClients() {
        return clientDAO.listClients();
    }
}
