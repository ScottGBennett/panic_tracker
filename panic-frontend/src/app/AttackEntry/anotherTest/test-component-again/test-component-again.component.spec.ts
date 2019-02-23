import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestComponentAgainComponent } from './test-component-again.component';

describe('TestComponentAgainComponent', () => {
  let component: TestComponentAgainComponent;
  let fixture: ComponentFixture<TestComponentAgainComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestComponentAgainComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestComponentAgainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
