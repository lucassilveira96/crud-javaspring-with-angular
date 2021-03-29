package com.silveira.developer.listatarefasapi.services;

import com.silveira.developer.listatarefasapi.model.Tarefa;
import com.silveira.developer.listatarefasapi.service.TarefaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class TarefaServiceImplTest {
    @Autowired
    TarefaServiceImpl serviceImpl;

    @Test
    public void create(){
        Tarefa tarefa = new Tarefa(1L,"Teste",false);
        serviceImpl.create(tarefa);

        int countTarefas = serviceImpl.getAll().size();
        assertEquals(4, countTarefas);
    }

    @Test
    public void update(){
        Tarefa tarefa = serviceImpl.getById(14L);
        Tarefa tarefaUpdate = new Tarefa(14L,"lista de compras01",true);
        serviceImpl.update(tarefaUpdate);

        assertNotEquals(tarefa.getDescricao(),tarefaUpdate.getDescricao());
        assertNotEquals(tarefa.isStatus(),tarefaUpdate.isStatus());
    }

    @Test
    public void getById(){
        Tarefa tarefa = serviceImpl.getById(14L);

        assertEquals("lista de compras01",tarefa.getDescricao());
        assertEquals(true,tarefa.isStatus());
        assertEquals("14",String.valueOf(tarefa.getId()));
    }

    @Test
    public void getAll(){
        int countTarefas = serviceImpl.getAll().size();

        assertEquals(3,countTarefas);
    }

    @Test
    public void delete(){
        serviceImpl.delete(14L);
        int countTarefas = serviceImpl.getAll().size();

        assertEquals(2,countTarefas);
    }
}
