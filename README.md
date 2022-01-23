# 
teste utilizando Java Spring com Angular e Junit para testes.
Foram criadas duas Api uma utilizando a base de dados MySQL e outra utilizando H2.

# Rotas Api:
GET
Pegar todas as Listas de Tarefas
  * localhost:8080/api/v1/listadetarefas

GET
Pegar determinada Lista de Tarefas
  * localhost:8080/api/v1/listadetarefas/id

POST
Cadastrar uma Lista de Tarefas
  * localhost:8080/api/v1/listadetarefas/
 
PUT
Alterar uma Lista de Tarefas
  * localhost:8080/api/v1/listadetarefas/id

DELETE
Deletar uma Lista de Tarefas
  * localhost:8080/api/v1/listadetarefas/id

# Rotas Front:
Adicionar uma nova lista de Tarefas
 * localhost:4200/lista-tarefas-add

Detalhes de uma Lista de Tarefa
 * localhost:4200/lista-tarefas-details/id

Mostrar todas Listas de Tarefas Cadastradas
 * localhost:4200/lista-tarefas-list

Adicionar uma Tarefa passando o id da Lista.
 * localhost:4200/tarefa-add/:id
