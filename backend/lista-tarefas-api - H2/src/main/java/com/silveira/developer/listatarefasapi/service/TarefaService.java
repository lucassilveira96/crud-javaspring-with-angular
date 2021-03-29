package com.silveira.developer.listatarefasapi.service;

import com.silveira.developer.listatarefasapi.model.Tarefa;

import java.util.List;

public interface TarefaService {
    public void create(Tarefa tarefa);
    public void update(Tarefa tarefa);
    public void delete(Long id);
    public Tarefa getById(Long id);
    public List<Tarefa> getAll();

}
