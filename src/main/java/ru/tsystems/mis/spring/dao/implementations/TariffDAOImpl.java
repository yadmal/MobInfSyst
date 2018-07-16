package ru.tsystems.mis.spring.dao.implementations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.TariffDAO;
import ru.tsystems.mis.spring.model.Tariff;

import java.io.Serializable;
import java.util.List;

@EnableTransactionManagement

@Repository
public class TariffDAOImpl implements TariffDAO {

    private static final Logger logger = LoggerFactory.getLogger(TariffDAOImpl.class);

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public void addTariff(Tariff tariff) {
        Session session = factory.openSession();
        session.save(tariff);
        session.flush();
        logger.info("Tariff successfully saved. Tariff details: " + tariff);
        session.close();
    }

    @Transactional
    @Override
    public void updateTariff(Tariff tariff) {
        Session session = factory.openSession();
        session.update(tariff);
        session.flush();
        logger.info("Tariff successfully update. Tariff details: " + tariff);
        session.close();
    }

    @Transactional
    @Override
    public void deleteTariff(Long id) {
        Session session = factory.openSession();
        Tariff tariff =(Tariff) session.get(Tariff.class, id);
        if (tariff != null) {
            session.delete(tariff);
            session.flush();
            logger.info("Tariff successfully delete. Tariff details: " + tariff);
        } else {
            logger.info("Couldn't delete tariff " + tariff);
        }
        session.close();
    }

    @Transactional
    @Override
    public Tariff getTariffById(Long id) {
        Session session = factory.openSession();
        Tariff tariff = (Tariff) session.get(Tariff.class, id);
        session.flush();
        logger.info("Tariff successfully loaded. Tariff details: " + tariff);
        session.close();
        return tariff;
    }

    @Transactional
    @Override
    @SuppressWarnings("unchecked")
    public List<Tariff> listTariffs() {
        Session session = factory.openSession();
        List<Tariff> list = session.createQuery("from Tariff").list();
        session.flush();
        for (Tariff tariff : list) {
            logger.info("Tariff list: " + tariff);
        }
        session.close();
        return list;
    }
}
