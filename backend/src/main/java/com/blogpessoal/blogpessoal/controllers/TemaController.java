package com.blogpessoal.blogpessoal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal.models.Tema;
import com.blogpessoal.blogpessoal.services.TemaService;

@RestController
@RequestMapping(value = "/temas")
public class TemaController {

	@Autowired
	TemaService service;

	@GetMapping
	public ResponseEntity<List<Tema>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
}
