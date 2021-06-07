package com.localizecars.localizecars.controller;

import com.localizecars.localizecars.models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface UsuarioController extends JpaRepository<Usuario, Long> {

}
