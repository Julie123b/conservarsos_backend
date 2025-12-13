package com.conservarsos.backend.repository;

import com.conservarsos.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositorio de Usuario
 * Proyecto ConservArSOS
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
