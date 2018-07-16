package ru.tsystems.mis.spring.dao.implementations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ContractDAO;
import ru.tsystems.mis.spring.model.Contract;

import java.io.Serializable;
import java.util.List;

@EnableTransactionManagement
@Repository
public class ContractDAOImpl implements ContractDAO {

    private static final Logger logger = LoggerFactory.getLogger(ContractDAOImpl.class);

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public void addContract(Contract contract) {
        Session session = factory.openSession();
        session.save(contract);
        session.flush();
        logger.info("Contract successfully saved. Contract details: " + contract);
        session.close();
    }

    @Transactional
    @Override
    public void updateContract(Contract contract) {
        Session session = factory.openSession();
        session.update(contract);
        session.flush();
        logger.info("Contract successfully update. Contract details: " + contract);
        session.close();
    }


    @Transactional
    @Override
    public void deleteContract(Long id) {
        Session session = factory.openSession();
        Contract contract = (Contract) session.get(Contract.class, new Long(id));
        if(contract != null){
            session.delete(contract);
            session.flush();
            logger.info("Contract successfully delete. Contract details: " + contract);
        } else {
            logger.info("Couldn't delete contract " + contract);
        }
        session.close();

    }

    @Transactional
    @Override
    public Contract getContractById(Long id) {
        Session session = factory.openSession();
        Contract contract = (Contract) session.get(Contract.class, id);
//        session.flush();
        logger.info("Contract successfully loaded. Contract details: " + contract);
        session.close();
        return contract;
    }

    @Transactional
    @Override
    @SuppressWarnings("unchecked")
    public List<Contract> listContracts() {
        Session session = factory.openSession();
        List<Contract> list = session.createQuery("from Contract").list();
        session.flush();
        for (Contract contract : list) {
            logger.info("Contract list: " + contract);
        }
        session.close();
        return list;
    }
}
