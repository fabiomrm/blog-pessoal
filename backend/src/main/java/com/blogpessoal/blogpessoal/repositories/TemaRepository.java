package com.blogpessoal.blogpessoal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.blogpessoal.models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {

}
