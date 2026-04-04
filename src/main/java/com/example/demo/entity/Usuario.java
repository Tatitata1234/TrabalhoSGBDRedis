package com.example.demo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@RedisHash("Usuario")
public class Usuario {
    @Id
    @Indexed
    private String id;
    private String nome;
    private String nickname;
    private String senha;
    private int idade;
    private boolean ativo;

    private List<String> tarefasIds;

    public Usuario(String nome, String nickname, String senha, int idade) {
        this.nome = nome;
        this.nickname = nickname;
        this.senha = senha;
        this.idade = idade;
        this.ativo = true;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<String> getTarefasIds() {
        return tarefasIds;
    }

    public void setTarefasIds(List<String> tarefasIds) {
        this.tarefasIds = tarefasIds;
    }
}
