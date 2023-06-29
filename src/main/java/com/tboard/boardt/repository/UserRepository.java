package com.tboard.boardt.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tboard.boardt.entity.User;

public interface UserRepository extends JpaRepository<User,UUID>
{
    
}
