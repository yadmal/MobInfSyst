package ru.tsystems.mis.spring.dao.interfaces;

import ru.tsystems.mis.spring.model.Option;
import ru.tsystems.mis.spring.model.Role;

import java.util.List;

public interface RoleDAO {
    void addRole(Role role);

    void updateRole(Role role);

    void deleteRole(Long id);

    Role getRoleById(Long id);

    List<Role> listRoles();
}
