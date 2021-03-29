package com.silveira.developer.listatarefasapi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lista_tarefas")
public class ListaDeTarefas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String nomeLista;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="lista_tarefas_id")
    private List<Tarefa> tarefas ;

}
