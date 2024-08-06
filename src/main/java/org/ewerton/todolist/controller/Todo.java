package org.ewerton.todolist.controller;

import jakarta.persistence.*;

@Entity
@Table(name ="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizada;
    private int prioridade;

    public Todo(int prioridade, boolean realizada, String descricao, String nome, Long id) {
        this.prioridade = prioridade;
        this.realizada = realizada;
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }
    public Todo(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
