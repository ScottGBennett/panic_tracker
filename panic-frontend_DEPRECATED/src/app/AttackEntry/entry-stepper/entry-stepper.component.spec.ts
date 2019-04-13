import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EntryStepperComponent } from './entry-stepper.component';

describe('EntryStepperComponent', () => {
  let component: EntryStepperComponent;
  let fixture: ComponentFixture<EntryStepperComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EntryStepperComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EntryStepperComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
