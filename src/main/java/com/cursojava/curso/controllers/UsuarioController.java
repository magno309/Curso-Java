package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable int id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Luis");
        usuario.setApellido("Sanabria");
        usuario.setEmail("luis@mail.com");
        usuario.setTelefono("1323216585");
        usuario.setPassword("melecio");
        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Sanabria");
        usuario.setEmail("luis@mail.com");
        usuario.setTelefono("1323216585");
        usuario.setPassword("melecio");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Sanabria");
        usuario.setEmail("luis@mail.com");
        usuario.setTelefono("1323216585");
        usuario.setPassword("melecio");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Luis");
        usuario.setApellido("Sanabria");
        usuario.setEmail("luis@mail.com");
        usuario.setTelefono("1323216585");
        usuario.setPassword("melecio");
        return usuario;
    }

}
