import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-entry',
  templateUrl: './entry.component.html',
  styleUrls: ['./entry.component.css']
})
export class EntryComponent implements OnInit {

  entryForm = this.fb.group({
    before: this.fb.group({
      thoughtsBefore: [''],
      behaviorsBefore: [''],
      actionsBefore: ['']
    }),
    during: this.fb.group({
      thoughtsDuring: [''],
      behaviorsDuring: [''],
      actionsDuring: ['']
    }),
    after: this.fb.group({
      thoughtsAfter: [''],
      behaviorsAfter: [''],
      actionsAfter: ['']
    })
  });

  constructor(private fb: FormBuilder) { }

  ngOnInit() {
  }

  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.entryForm.value);
  }

}
