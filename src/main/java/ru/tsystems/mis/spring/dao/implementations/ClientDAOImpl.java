package ru.tsystems.mis.spring.dao.implementations;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ClientDAO;
import ru.tsystems.mis.spring.model.Client;



import java.util.List;

@EnableTransactionManagement
@Repository
public class ClientDAOImpl implements ClientDAO {

    private static final Logger logger = LoggerFactory.getLogger(ClientDAOImpl.class);

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public void addClient(Client client) {
        Session session = factory.openSession();
        session.save(client);
        session.flush();
        logger.info("Client successfully saved. Client details: " + client);
        session.close();
    }

    @Transactional
    @Override
    public void updateClient(Client client) {
        Session session = factory.openSession();
        session.update(client);
        session.flush();
        logger.info("Client successfully update. Client details: " + client);
        session.close();
    }


    @Transactional
    @Override
    public void deleteClient(Long id) {
        Session session = factory.openSession();
        Client client = (Client) session.get(Client.class, new Long(id));
        if(client != null){
            session.delete(client);
            session.flush();
            logger.info("Client successfully delete. Client details: " + client);
        } else {
            logger.info("Couldn't delete client " + client);
        }
        session.close();

    }

    @Transactional
    @Override
    public Client getClientByUsername(String username) {
        Session session = factory.openSession();
        Query query = session.createQuery("FROM Client cl WHERE cl.username=:username").setParameter("username", username);
        Client client = (Client) query.uniqueResult();
//        session.flush();
        logger.info("Client successfully loaded by username. Client details: " + client);
        session.close();
        return client;
    }

    @Transactional
    @Override
    public Client getClientById(Long id) {
        Session session = factory.openSession();
        Client client = (Client) session.get(Client.class, id);
//        session.flush();
        logger.info("Client successfully loaded by id. Client details: " + client);
        session.close();
        return client;
    }

    @Transactional
    @Override
    @SuppressWarnings("unchecked")
    public List<Client> listClients() {
        Session session = factory.openSession();
        List<Client> list = session.createQuery("from Client").list();
        session.flush();
        for (Client client : list) {
            logger.info("Client list: " + client);
        }
        session.close();
        return list;
    }
}
