package com.blogpessoal.blogpessoal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.blogpessoal.models.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
