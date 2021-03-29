import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTarefasListComponent } from './lista-tarefas-list.component';

describe('ListaTarefasListComponent', () => {
  let component: ListaTarefasListComponent;
  let fixture: ComponentFixture<ListaTarefasListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaTarefasListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaTarefasListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
