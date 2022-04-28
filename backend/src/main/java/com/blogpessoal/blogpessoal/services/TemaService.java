package com.blogpessoal.blogpessoal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogpessoal.blogpessoal.models.Tema;
import com.blogpessoal.blogpessoal.repositories.TemaRepository;

@Service
public class TemaService {

	@Autowired
	private TemaRepository repository;

	@Transactional(readOnly = true)
	public List<Tema> findAll() {
		return repository.findAll();
	}
}
