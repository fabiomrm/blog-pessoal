package com.blogpessoal.blogpessoal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogpessoal.blogpessoal.models.Postagem;
import com.blogpessoal.blogpessoal.repositories.PostagemRepository;

@Service
public class PostagemService {

	@Autowired
	private PostagemRepository repository;

	@Transactional(readOnly = true)
	public List<Postagem> findAll() {
		return repository.findAll();
	}
}
