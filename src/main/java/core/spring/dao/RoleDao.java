package core.spring.dao;

import core.spring.model.Role;

public interface RoleDao {
    Role add(Role role);

    Role getByName(String roleName);
}
