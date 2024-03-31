package com.example.Hibernateassociation.Repository;

import com.example.Hibernateassociation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
