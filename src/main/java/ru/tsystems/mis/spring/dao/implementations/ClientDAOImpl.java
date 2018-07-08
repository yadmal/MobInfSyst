package ru.tsystems.mis.spring.dao.implementations;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.tsystems.mis.spring.dao.interfaces.ClientDAO;
import ru.tsystems.mis.spring.model.Client;


import java.util.List;

public class ClientDAOImpl implements ClientDAO {

    @Autowired
    SessionFactory factory;


    @Override
    public int add(Client client) {
        return 0;
    }

    @Override
    public int update(Client client) {
        return 0;
    }

    @Override
    public int delete(Client client) {
        return 0;
    }

    @Override
    public Client get(Long id) {
        return null;
    }

    @Override
    public List<Client> list() {
        return null;
    }
}
