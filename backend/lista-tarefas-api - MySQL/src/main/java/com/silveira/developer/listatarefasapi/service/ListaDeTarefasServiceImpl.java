package com.silveira.developer.listatarefasapi.service;

import com.silveira.developer.listatarefasapi.model.ListaDeTarefas;
import com.silveira.developer.listatarefasapi.repository.ListaDeTarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ListaDeTarefasServiceImpl implements ListaDeTarefasService{
    @Autowired
    private ListaDeTarefasRepository listaDeTarefasRepository;

    @Override
    public void create(ListaDeTarefas listaDeTarefas) {
        this.listaDeTarefasRepository.save(listaDeTarefas);
    }

    @Override
    public void update(ListaDeTarefas listaDeTarefas) {
        create(listaDeTarefas);
    }

    @Override
    public void delete(Long id) {
        this.listaDeTarefasRepository.deleteById(id);
    }

    @Override
    public ListaDeTarefas getById(Long id) {
        return this.listaDeTarefasRepository.findById(id).get();
    }

    @Override
    public List<ListaDeTarefas> getAll() {
        return this.listaDeTarefasRepository.findAll();
    }
}
