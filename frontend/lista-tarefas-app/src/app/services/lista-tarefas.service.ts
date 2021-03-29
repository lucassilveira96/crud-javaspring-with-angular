import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'
import { ListaDeTarefas } from '../models/listaDeTarefas'

const baseUrl = 'http://localhost:8080/api/v1/listadetarefas'

@Injectable({
  providedIn: 'root'
})
export class ListaTarefasService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<ListaDeTarefas[]> {
    return this.http.get<ListaDeTarefas[]>(baseUrl);
  }

  getById(id: any): Observable<ListaDeTarefas> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any>{
    return this.http.post(baseUrl,data);
  }

  update(listaDeTarefas: ListaDeTarefas){
    return this.http.put(baseUrl,listaDeTarefas);
  }

  delete(id: any): Observable<any>{
    return this.http.delete(`${baseUrl}/${id}`)
  }

}
