import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

const baseUrl = 'http://localhost:8080/api/v1/tarefa'
@Injectable({
  providedIn: 'root'
})

export class TarefaService {

  constructor(private http: HttpClient) { }

  delete(id: any): Observable<any>{
    return this.http.delete(`${baseUrl}/${id}`)
  }

}
