package com.example.demo.mapper;

import com.example.demo.controller.request.TarefaRequest;
import com.example.demo.controller.response.TarefaDetalhadoResponse;
import com.example.demo.controller.response.TarefaResponse;
import com.example.demo.entity.Tarefa;

import java.util.UUID;

public class TarefaMapper {

    private TarefaMapper() {}

    public static TarefaResponse toResponse(Tarefa tarefa) {
        return new TarefaResponse(tarefa.getId());
    }

    public static Tarefa toEntity(TarefaRequest request) {
        Tarefa tarefa = new Tarefa(request.getTitulo(), request.getStatus(), request.getDescricao());
        tarefa.setId(UUID.randomUUID().toString());
        return tarefa;
    }

    public static TarefaDetalhadoResponse toResponseDetalhado(Tarefa tarefa) {
        return new TarefaDetalhadoResponse(
                tarefa.getId(),
                tarefa.getTitulo(),
                tarefa.getStatus(),
                tarefa.getDescricao()
        );
    }
}
