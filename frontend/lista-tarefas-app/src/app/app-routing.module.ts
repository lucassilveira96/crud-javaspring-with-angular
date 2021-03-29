import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaTarefasAddComponent } from './components/lista-tarefas/lista-tarefas-add/lista-tarefas-add.component';
import { ListaTarefasDetailsComponent } from './components/lista-tarefas/lista-tarefas-details/lista-tarefas-details.component';
import { ListaTarefasListComponent } from './components/lista-tarefas/lista-tarefas-list/lista-tarefas-list.component';;
import { TarefaAddComponent } from './components/tarefa/tarefa-add/tarefa-add.component';

const routes: Routes = [
  {path: '', redirectTo:'lista-tarefas-add', pathMatch:'full'},
  {path: 'lista-tarefas-add', component: ListaTarefasAddComponent},
  {path: 'lista-tarefas-details/:id', component: ListaTarefasDetailsComponent},
  {path: 'lista-tarefas-list', component: ListaTarefasListComponent},
  {path: 'tarefa-add/:id', component: TarefaAddComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
