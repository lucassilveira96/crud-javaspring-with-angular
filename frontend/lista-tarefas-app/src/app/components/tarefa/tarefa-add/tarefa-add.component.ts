import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ListaDeTarefas } from 'src/app/models/listaDeTarefas';
import { Tarefa } from 'src/app/models/tarefa';
import { ListaTarefasService } from 'src/app/services/lista-tarefas.service';

@Component({
  selector: 'app-tarefa-add',
  templateUrl: './tarefa-add.component.html',
  styleUrls: ['./tarefa-add.component.css']
})
export class TarefaAddComponent implements OnInit {
  listaDeTarefas: ListaDeTarefas = new ListaDeTarefas();
  id: any;
  tarefas: Array<Tarefa>=[];
  tarefa: Tarefa = new Tarefa();
  constructor(private activatedRoute: ActivatedRoute, private listaTarefasService:ListaTarefasService, private router:Router){
    this.id=this.activatedRoute.snapshot.paramMap.get("id");
   }

  ngOnInit(): void {
    this.getById(this.id);
  }

  getById(id:number){
    id=this.id;
    this.listaTarefasService.getById(id)
    .subscribe((data:any)=>{
      this.listaDeTarefas=data;
      for(let i=0;i<data.tarefas?.length;i++){
        this.tarefas.push(data.tarefas[i]);
      }
    });
  }

  save(){
    this.listaDeTarefas.tarefas=[];
    this.tarefas.push(this.tarefa);
    this.listaDeTarefas.tarefas=this.tarefas;
    this.listaTarefasService.update(this.listaDeTarefas)
    .subscribe((data:any)=>{
      this.router.navigate(['/lista-tarefas-details',this.listaDeTarefas.id])
    });
  }

}
