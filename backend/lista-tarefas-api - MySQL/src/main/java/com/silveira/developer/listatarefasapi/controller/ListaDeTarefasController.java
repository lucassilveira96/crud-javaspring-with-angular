package com.silveira.developer.listatarefasapi.controller;

import com.silveira.developer.listatarefasapi.model.ListaDeTarefas;
import com.silveira.developer.listatarefasapi.service.ListaDeTarefasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin
@RequestMapping("/api/v1/listadetarefas")
public class ListaDeTarefasController {
    @Autowired
    private ListaDeTarefasServiceImpl listaDeTarefasService;

    @PostMapping
    public void create(@RequestBody ListaDeTarefas listaDeTarefas){
        this.listaDeTarefasService.create(listaDeTarefas);
    }

    @PutMapping
    public void update(@RequestBody ListaDeTarefas listaDeTarefas){
        this.listaDeTarefasService.update(listaDeTarefas);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.listaDeTarefasService.delete(id);
    }

    @GetMapping
    public List<ListaDeTarefas> getAll(){
        return this.listaDeTarefasService.getAll();
    }

    @GetMapping("/{id}")
    public ListaDeTarefas getById(@PathVariable Long id){
        return this.listaDeTarefasService.getById(id);
    }
}
