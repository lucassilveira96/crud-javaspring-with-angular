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
    public void getById(){
        ListaDeTarefas listaDeTarefas = serviceImpl.getById(7L);

        assertEquals("compras supermercado",listaDeTarefas.getNomeLista());
        assertEquals("7",String.valueOf(listaDeTarefas.getId()));
    }

    @Test
    public void create(){
        List<Tarefa> listTarefas = new ArrayList<Tarefa>();
        Tarefa tarefa = new Tarefa(1L,"teste01",false);
        listTarefas.add(tarefa);
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas(1L,"teste",listTarefas);
        serviceImpl.create(listaDeTarefas);

        
    }

    @Test
    public void getAll(){
        int countTarefas = serviceImpl.getAll().size();
        assertEquals(4,countTarefas);
    }

    @Test
    public void delete(){
        serviceImpl.delete(15L);
        int countTarefas = serviceImpl.getAll().size();
        assertEquals(3,countTarefas);
    }

    @Test
    public void update(){
        ListaDeTarefas listaDeTarefas = serviceImpl.getById(12L);
        List<Tarefa> tarefas = new ArrayList<Tarefa>();
        ListaDeTarefas listaTarefasUpdate = new ListaDeTarefas(12L,"teste01",tarefas);
        serviceImpl.update(listaTarefasUpdate);

        assertNotEquals(listaDeTarefas.getNomeLista(), listaTarefasUpdate.getNomeLista());
    }
}
