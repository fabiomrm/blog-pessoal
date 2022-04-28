package com.blogpessoal.blogpessoal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogpessoal.blogpessoal.models.Usuario;
import com.blogpessoal.blogpessoal.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return repository.findAll();
	}
}
