package ru.tsystems.mis.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.model.Option;

import java.io.Serializable;
import java.util.List;

public class OptionDAOImpl implements OptionDAO {

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public int add(Option option) {
        Session session = factory.openSession();
        Serializable id = session.save(option);
        session.close();
        return Integer.valueOf(id.toString());
    }

    @Transactional
    @Override
    public int update(Option option) {
        Session session = factory.openSession();
        session.update(option);
        Serializable id = session.getIdentifier(session);
        session.close();
        return Integer.valueOf(id.toString());
    }


    @Transactional
    @Override
    public int delete(Option option) {
        Session session = factory.openSession();
        session.delete(option);
        Serializable id = session.getIdentifier(session);
        session.close();
        return Integer.valueOf(id.toString());
    }

    @Transactional
    @Override
    public Option get(Long id) {
        Session session = factory.openSession();
        Option option = session.load(Option.class, id);
        session.close();
        return option;
    }

    @Transactional
    @Override
    public List<Option> list() {
        Session session = factory.openSession();
        @SuppressWarnings("unchecked")
        List<Option> list = session.createQuery("from Option").list();
        session.close();
        return list;
    }
}
