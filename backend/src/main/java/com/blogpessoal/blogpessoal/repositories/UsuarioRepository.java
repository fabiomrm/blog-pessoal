package com.blogpessoal.blogpessoal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogpessoal.blogpessoal.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
