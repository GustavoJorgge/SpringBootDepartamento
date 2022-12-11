package com.projetoautoral.UsuarioDept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoautoral.UsuarioDept.entities.User;
import com.projetoautoral.UsuarioDept.repositories.UserRepository;

@RestController
@RequestMapping( value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository; 
	
	@GetMapping //Consultando todos os usuarios - getMapping é um verbo HTTP que realiza buscas
	public List<User> findAll(){
		List<User> result = repository.findAll();
		 
		 return result;
	}
	
	@GetMapping(value = "/{id}") //Estamos consultando os usuarios por Id 
	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		 
		 return result;
	}
	
	@PostMapping
	public User insert(@RequestBody User user){ //Salvando um novo usuario - RequestBody indica que o valor do objeto vira um corpo da requisição
		User result = repository.save(user);
		 
		return result;
	}
}
