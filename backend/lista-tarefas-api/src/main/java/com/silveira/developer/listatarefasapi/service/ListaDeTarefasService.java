package com.silveira.developer.listatarefasapi.service;

import com.silveira.developer.listatarefasapi.model.ListaDeTarefas;

import java.util.List;

public interface ListaDeTarefasService {
    public void create(ListaDeTarefas listaDeTarefas);
    public void update(ListaDeTarefas listaDeTarefas);
    public void delete(Long id);
    public ListaDeTarefas getById(Long id);
    public List<ListaDeTarefas> getAll();
}
