import { RestService } from './../../service/rest.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder } from '@angular/forms';
import { restoreView } from '@angular/core/src/render3';
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

}
