package ru.tsystems.mis.spring.dao.implementations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.RoleDAO;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.model.Role;

import java.util.List;

@EnableTransactionManagement
@Repository
public class RoleDaoImpl implements RoleDAO {

    private static final Logger logger = LoggerFactory.getLogger(RoleDaoImpl.class);

    @Autowired
    SessionFactory factory;

    @Transactional
    @Override
    public void addRole(Role role) {
        Session session = factory.openSession();
        session.save(role);
        session.flush();
        logger.info("Role successfully saved. Role details: " + role);
        session.close();
    }

    @Transactional
    @Override
    public void updateRole(Role role) {
        Session session = factory.openSession();
        session.update(role);
        session.flush();
        logger.info("Role successfully update. Role details: " + role);
        session.close();
    }


    @Transactional
    @Override
    public void deleteRole(Long id) {
        Session session = factory.openSession();
        Role role = (Role) session.get(Role.class, new Long(id));
        if(role != null){
            session.delete(role);
            session.flush();
            logger.info("Role successfully delete. Role details: " + role);
        } else {
            logger.info("Couldn't delete role " + role);
        }
        session.close();

    }

    @Transactional
    @Override
    public Role getRoleById(Long id) {
        Session session = factory.openSession();
        Role role = (Role) session.get(Role.class, id);
//        session.flush();
        logger.info("Role successfully loaded. Role details: " + role);
        session.close();
        return role;
    }

    @Transactional
    @Override
    @SuppressWarnings("unchecked")
    public List<Role> listRoles() {
        Session session = factory.openSession();
        List<Role> list = session.createQuery("from Role").list();
        session.flush();
        for (Role role : list) {
            logger.info("Role list: " + role);
        }
        session.close();
        return list;
    }
}
