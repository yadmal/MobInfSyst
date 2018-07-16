package ru.tsystems.mis.spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import ru.tsystems.mis.spring.dao.interfaces.ClientDAO;
import ru.tsystems.mis.spring.model.Client;
import ru.tsystems.mis.spring.model.Role;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * Implementation of {@link UserDetailsService} interface
 *
 *  @author Dmitry Yashkin
 *  @version 1.0
 */
public class ClientDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private ClientDAO clientDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientDAO.getClientByUsername(username);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();

        for (Role role:client.getRoles()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return new org.springframework.security.core.userdetails.User(client.getUsername(), client.getPassword(), grantedAuthorities);
    }
}
