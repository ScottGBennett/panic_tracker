import { RestService } from './../../service/rest.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { Entry } from './entry.model';

@Component({
  selector: 'app-entry',
  templateUrl: './entry.component.html',
  styleUrls: ['./entry.component.css']
})
export class EntryComponent implements OnInit {

  entryForm = this.fb.group({
    before: this.fb.group({
      thoughtsBefore: [''],
      behaviorsBefore: ['']
    }),
    during: this.fb.group({
      thoughtsDuring: [''],
      behaviorsDuring: ['']
    }),
    after: this.fb.group({
      thoughtsAfter: [''],
      behaviorsAfter: ['']
    })
  });

  thoughtsBeforeInput: Array<string> = new Array();
  thoughtsDuringInput: Array<string> = new Array();
  thoughtsAfterInput: Array<string> = new Array();
  behaviorsBeforeInput: Array<string> = new Array();
  behaviorsDuringInput: Array<string> = new Array();
  behaviorsAfterInput: Array<string> = new Array();

  constructor(private fb: FormBuilder, private rest: RestService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.rest.postEntry(this.buildEntryFromInput()).subscribe();
  }

  private buildEntryFromInput(): Entry {
    const entry = new Entry();
    entry.date = new Date();
    const before = this.entryForm.get('before').value;
    const during = this.entryForm.get('during').value;
    const after = this.entryForm.get('after').value;

    entry.thoughtsBefore = before.thoughtsBefore.split(',');
    entry.behaviorsBefore = before.behaviorsBefore.split(',');
    entry.thoughtsDuring = during.thoughtsDuring.split(',');
    entry.behaviorsDuring = during.behaviorsDuring.split(',');
    entry.thoughtsAfter = after.thoughtsAfter.split(',');
    entry.behaviorsAfter = after.behaviorsAfter.split(',');
    entry.userName = 'nimchimpsky';
    return entry;
  }

  private enterValueIntoArray(value: string, name: string): void {
    switch (name) {
      case 'thoughtsBefore': {
        this.thoughtsBeforeInput.push(value);
        break;
      }
      case 'thoughtsDuring': {
        this.thoughtsDuringInput.push(value);
        break;
      }
      case 'thoughtsAfter': {
        this.thoughtsAfterInput.push(value);
        break;
      }
      case 'behaviorsBefore': {
        this.behaviorsBeforeInput.push(value);
        break;
      }
      case 'behaviorsDuring': {
        this.behaviorsDuringInput.push(value);
        break;
      }
      case 'behaviorsAfter': {
        this.behaviorsAfterInput.push(value);
        break;
      }
    }
  }

}
