package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findByNickname(String nickname);
    Optional<Usuario> findById(String id);
}
