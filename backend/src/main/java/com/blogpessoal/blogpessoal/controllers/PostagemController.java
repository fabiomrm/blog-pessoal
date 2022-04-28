package com.blogpessoal.blogpessoal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal.models.Postagem;
import com.blogpessoal.blogpessoal.services.PostagemService;

@RestController
@RequestMapping(value = "/postagens")
public class PostagemController {

	@Autowired
	PostagemService service;

	@GetMapping
	public ResponseEntity<List<Postagem>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
}
