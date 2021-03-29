import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'
import { HttpClientModule} from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaTarefasAddComponent } from './components/lista-tarefas/lista-tarefas-add/lista-tarefas-add.component';
import { ListaTarefasListComponent } from './components/lista-tarefas/lista-tarefas-list/lista-tarefas-list.component';
import { ListaTarefasDetailsComponent } from './components/lista-tarefas/lista-tarefas-details/lista-tarefas-details.component';
import { from } from 'rxjs';
import { TarefaAddComponent } from './components/tarefa/tarefa-add/tarefa-add.component';
import { FooterComponent } from './components/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaTarefasAddComponent,
    ListaTarefasListComponent,
    ListaTarefasDetailsComponent,
    TarefaAddComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
