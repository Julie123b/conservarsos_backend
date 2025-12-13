package com.conservarsos.backend.controller;

import com.conservarsos.backend.model.Usuario;
import com.conservarsos.backend.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador del módulo de registro de usuarios
 * Framework: Spring Boot
 */
@RestController
@RequestMapping("/registro")
public class RegistroController {

    private final UsuarioService usuarioService;

    public RegistroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Método para registrar un usuario
     */
    @PostMapping
    public Usuario registrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.guardarUsuario(usuario);
    }
}
