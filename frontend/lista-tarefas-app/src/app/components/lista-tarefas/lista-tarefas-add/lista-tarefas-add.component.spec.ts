import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTarefasAddComponent } from './lista-tarefas-add.component';

describe('ListaTarefasAddComponent', () => {
  let component: ListaTarefasAddComponent;
  let fixture: ComponentFixture<ListaTarefasAddComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaTarefasAddComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaTarefasAddComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
