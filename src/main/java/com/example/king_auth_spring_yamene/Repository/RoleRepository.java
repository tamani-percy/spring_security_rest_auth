package com.example.king_auth_spring_yamene.Repository;

import com.example.king_auth_spring_yamene.Model.ERole;
import com.example.king_auth_spring_yamene.Model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
