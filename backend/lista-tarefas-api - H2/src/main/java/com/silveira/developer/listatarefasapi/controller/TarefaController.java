package com.silveira.developer.listatarefasapi.controller;

import com.silveira.developer.listatarefasapi.model.Tarefa;
import com.silveira.developer.listatarefasapi.service.TarefaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tarefa")
public class TarefaController {
    @Autowired
    private TarefaServiceImpl tarefaService;

    @PostMapping
    public void create(@RequestBody Tarefa tarefa){
        this.tarefaService.create(tarefa);
    }

    @PutMapping
    public void update(@RequestBody Tarefa tarefa){
        this.tarefaService.update(tarefa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.tarefaService.delete(id);
    }

    @GetMapping("/{id}")
    public Tarefa getById(@PathVariable Long id){
        return this.tarefaService.getById(id);
    }

    @GetMapping
    public List<Tarefa> getAll(){
        return this.tarefaService.getAll();
    }
}
