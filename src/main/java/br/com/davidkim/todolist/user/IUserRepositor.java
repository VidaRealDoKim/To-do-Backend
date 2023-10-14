package br.com.davidkim.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepositor extends JpaRepository<UserModel, UUID> {
    
}
