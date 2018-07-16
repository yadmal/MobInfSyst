package ru.tsystems.mis.spring.service.interfaces;


/**
 * Service for Security
 *
 *  @author Dmitry Yashkin
 *  @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
