package com.silveira.developer.listatarefasapi.service;

import com.silveira.developer.listatarefasapi.model.Tarefa;
import com.silveira.developer.listatarefasapi.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TarefaServiceImpl implements TarefaService{
    @Autowired
    private TarefaRepository tarefaRepository;

    @Override
    public void create(Tarefa tarefa) {
        this.tarefaRepository.save(tarefa);
    }

    @Override
    public void update(Tarefa tarefa) {
        create(tarefa);
    }

    @Override
    public void delete(Long id) {
        this.tarefaRepository.deleteById(id);
    }

    @Override
    public Tarefa getById(Long id) {
        return this.tarefaRepository.findById(id).get();
    }

    @Override
    public List<Tarefa> getAll() {
        return this.tarefaRepository.findAll();
    }
}
