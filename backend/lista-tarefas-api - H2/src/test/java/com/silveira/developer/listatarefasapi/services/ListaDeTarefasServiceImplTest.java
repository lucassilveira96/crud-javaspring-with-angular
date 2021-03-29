package com.silveira.developer.listatarefasapi.services;

import com.silveira.developer.listatarefasapi.model.ListaDeTarefas;
import com.silveira.developer.listatarefasapi.model.Tarefa;
import com.silveira.developer.listatarefasapi.service.ListaDeTarefasServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ListaDeTarefasServiceImplTest {
    @Autowired
    private ListaDeTarefasServiceImpl serviceImpl;

    @Test
    public void create(){
        List<Tarefa> listTarefas = new ArrayList<Tarefa>();
        Tarefa tarefa = new Tarefa(1L,"Estudar Java Spring",false);
        listTarefas.add(tarefa);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(1L,"Tarefas da semana",listTarefas);
        serviceImpl.create(listaDeTarefas);
        
    }

    @Test
    public void getById(){
        ListaDeTarefas listaDeTarefas = serviceImpl.getById(1L);

        assertEquals("Tarefas da semana",listaDeTarefas.getNomeLista());
        assertEquals("1",String.valueOf(listaDeTarefas.getId()));
    }

    @Test
    public void getAll(){
        int countTarefas = serviceImpl.getAll().size();
        assertEquals(1,countTarefas);
    }

    @Test
    public void update(){
        ListaDeTarefas listaDeTarefas = serviceImpl.getById(1L);
        List<Tarefa> tarefas = new ArrayList<Tarefa>();
        Tarefa tarefa = new Tarefa(2L,"Estudar Java Spring com jwt",false);
        ListaDeTarefas listaTarefasUpdate = new ListaDeTarefas(1L,"Tarefas da semana final",tarefas);
        serviceImpl.update(listaTarefasUpdate);

        assertNotEquals(listaDeTarefas.getNomeLista(), listaTarefasUpdate.getNomeLista());
    }
     @Test
     public void delete(){
        serviceImpl.delete(1L);
        int countTarefas = serviceImpl.getAll().size();
        assertEquals(0,countTarefas);
    }

}
