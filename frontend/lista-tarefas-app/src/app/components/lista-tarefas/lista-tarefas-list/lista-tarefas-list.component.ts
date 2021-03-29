import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router'
import { ListaDeTarefas } from 'src/app/models/listaDeTarefas';
import { ListaTarefasService} from '../../../services/lista-tarefas.service'
@Component({
  selector: 'app-lista-tarefas-list',
  templateUrl: './lista-tarefas-list.component.html',
  styleUrls: ['./lista-tarefas-list.component.css']
})
export class ListaTarefasListComponent implements OnInit {

  listaDeTarefas: ListaDeTarefas = new ListaDeTarefas();
  list: Array<ListaDeTarefas>=[];
  constructor(private listaTarefasService: ListaTarefasService, private router: Router) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.listaTarefasService.getAll()
    .subscribe((data:any)=>{
      for(let i=0;i<data.length;i++){
        this.listaDeTarefas=data[i];
        this.list.push(this.listaDeTarefas);
      }
    });
  }

  getById(id:number){
    this.router.navigate(['list-tarefas-details',id]);
  }
}
