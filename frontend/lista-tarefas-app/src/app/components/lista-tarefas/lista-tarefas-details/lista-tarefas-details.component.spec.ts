import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaTarefasDetailsComponent } from './lista-tarefas-details.component';

describe('ListaTarefasDetailsComponent', () => {
  let component: ListaTarefasDetailsComponent;
  let fixture: ComponentFixture<ListaTarefasDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaTarefasDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaTarefasDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
