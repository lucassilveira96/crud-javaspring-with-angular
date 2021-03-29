import { Component, OnInit } from '@angular/core';
import { Tarefa } from '../../../models/tarefa'
import { ListaDeTarefas} from '../../../models/listaDeTarefas'
import { ListaTarefasService } from 'src/app/services/lista-tarefas.service';
import { from } from 'rxjs';
import { Router} from '@angular/router'

@Component({
  selector: 'app-lista-tarefas-add',
  templateUrl: './lista-tarefas-add.component.html',
  styleUrls: ['./lista-tarefas-add.component.css']
})
export class ListaTarefasAddComponent implements OnInit {

  listaDeTarefas: ListaDeTarefas = {
    nomeLista: '',
    tarefas: []
  }
  tarefa: Tarefa = new Tarefa()
  submitted = false;

  constructor(private listaTarefasService: ListaTarefasService, private router: Router) { }

  ngOnInit(): void {
  }

  saveListaTarefas(): void{
    const data = {
      nomeLista: this.listaDeTarefas.nomeLista,
      tarefas: []
    };
    this.listaTarefasService.create(data)
      .subscribe(
        response => {
          this.submitted=true;
          this.router.navigate(['/lista-tarefas-list'])
        },
        error => {
          console.log(error);
        });
  }
  newListaTarefas(): void{
    this.listaDeTarefas={
      nomeLista: '',
      tarefas: []
    }
    this.submitted=false;
  }
}
