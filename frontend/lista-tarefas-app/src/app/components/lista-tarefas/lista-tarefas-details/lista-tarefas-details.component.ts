import { ValueConverter } from '@angular/compiler/src/render3/view/template';
import { Component, OnInit } from '@angular/core';
import { from } from 'rxjs';
import { ListaDeTarefas } from 'src/app/models/listaDeTarefas';
import { Tarefa } from 'src/app/models/tarefa';
import { ListaTarefasService } from '../../../services/lista-tarefas.service'
import { ActivatedRoute} from '@angular/router'
import { TarefaService } from 'src/app/services/tarefa.service';

@Component({
  selector: 'app-lista-tarefas-details',
  templateUrl: './lista-tarefas-details.component.html',
  styleUrls: ['./lista-tarefas-details.component.css']
})
export class ListaTarefasDetailsComponent implements OnInit {

  listaDeTarefas: ListaDeTarefas = new ListaDeTarefas()
  tarefa: Tarefa = new Tarefa();
  tarefas:Array<Tarefa> = [];
  tarefasAlteradas:Array<Tarefa> = [];
  id:any;
  constructor(private listaTarefasService: ListaTarefasService, private activatedRoute: ActivatedRoute, private tarefaService: TarefaService) { 
    this.id=this.activatedRoute.snapshot.paramMap.get("id");
}
  ngOnInit(): void {
      this.getById(this.id)
  }

  getById(id:number){
    this.listaDeTarefas=new ListaDeTarefas();
    this.tarefas=[]
    this.tarefa = new Tarefa();
    id=this.id;
    this.listaTarefasService.getById(id)
      .subscribe((data:any) =>{
        this.listaDeTarefas=data;
        for(let i = 0; i < data.tarefas.length; i++){
          this.tarefa=data.tarefas[i];
          this.tarefas.push(this.tarefa);
          this.tarefa=new Tarefa()
        }
      });
  }
  updateStatus(id:number){
    for(let i=0; i<this.tarefas.length;i++){
      if(this.tarefas[i].id==id){
        if(this.tarefas[i].status==true){
          this.tarefas[i].status=false;
        }
        else{
          this.tarefas[i].status=true;
        }
      }
    }
    this.listaDeTarefas.tarefas=[];
    this.listaDeTarefas.tarefas=this.tarefas;
    this.listaTarefasService.update(this.listaDeTarefas)
    .subscribe((data:any)=>{

    });
  }

  excluirTarefa(id:number){
    this.tarefaService.delete(id)
    .subscribe((data:any)=>{
      this.getById(this.listaDeTarefas.id);
    })
  }
}
