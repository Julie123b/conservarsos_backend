package com.conservarsos.backend.service;

import com.conservarsos.backend.model.Usuario;
import com.conservarsos.backend.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

/**
 * Servicio para la gestión de usuarios
 * Proyecto ConservArSOS
 */
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    /**
     * Guarda un usuario en la base de datos
     */
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
