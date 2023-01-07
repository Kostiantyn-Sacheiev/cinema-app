package core.spring.service;

import core.spring.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
