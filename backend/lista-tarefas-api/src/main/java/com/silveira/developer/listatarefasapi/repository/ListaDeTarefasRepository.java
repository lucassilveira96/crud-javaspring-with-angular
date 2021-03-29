package com.silveira.developer.listatarefasapi.repository;

import com.silveira.developer.listatarefasapi.model.ListaDeTarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaDeTarefasRepository extends JpaRepository<ListaDeTarefas, Long> {
}
