package com.localizecars.localizecars.resources;

import java.util.List;

import com.localizecars.localizecars.models.Usuario;
import com.localizecars.localizecars.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@CrossOrigin
@Api(tags = { "Usuario" })
public class UsuarioResources {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/UsuarioReg")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario registrarUsuarios(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/UsuarioBusca")
    public List<Usuario> buscaUsuario() {
        return usuarioRepository.findAll();

    }
}
