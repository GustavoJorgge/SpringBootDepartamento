package com.projetoautoral.UsuarioDept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoautoral.UsuarioDept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
