package com.cursojava.curso.controllers;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getListUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Luis");
        usuario.setApellido("Sanabria");
        usuario.setEmail("luis@mail.com");
        usuario.setTelefono("1323216585");
        usuario.setPassword("melecio");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNombre("Luis");
        usuario2.setApellido("Sanabria");
        usuario2.setEmail("luis@mail.com");
        usuario2.setTelefono("1323216585");
        usuario2.setPassword("melecio");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNombre("Luis");
        usuario3.setApellido("Sanabria");
        usuario3.setEmail("luis@mail.com");
        usuario3.setTelefono("1323216585");
        usuario3.setPassword("melecio");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
