package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ClientDAO;
import ru.tsystems.mis.spring.dao.interfaces.RoleDAO;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.model.Role;
import ru.tsystems.mis.spring.service.interfaces.ClientService;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of {@link ClientService}
 *
 *  @author Dmitry Yashkin
 *  @version 1.0
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public void addClient(Client client) {
        client.setPassword(bCryptPasswordEncoder.encode(client.getPassword()));
        List<Role> roles = new ArrayList<>();
        roles.add(roleDAO.getRoleById(3L));
        client.setRoles(roles);
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
    public Client getClientByUsername(String username) {
        return clientDAO.getClientByUsername(username);
    }

    @Override
    @Transactional
    public List<Client> listClients() {
        return clientDAO.listClients();
    }
}
