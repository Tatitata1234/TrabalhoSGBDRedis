package com.example.demo.repository;

import com.example.demo.entity.Tarefa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TarefaRepository extends CrudRepository<Tarefa, String> {
    Tarefa findByTitulo(String titulo);

    List<Tarefa> findByUsuarioId(String userId);
}
