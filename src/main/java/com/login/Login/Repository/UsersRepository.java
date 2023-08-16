package com.login.Login.Repository;

import com.login.Login.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    public boolean existsByNameIgnoreCase(String name);

    public boolean existsByEmailIgnoreCase(String email);

    Users findByNameIgnoreCase(String name);
    Users findByEmail(String email);

    public Users getByEmail(String email);


}
