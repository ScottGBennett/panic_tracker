import { RestService } from './../service/rest.service';
import { Entry } from './../entry/entry/entry.model';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-entry-view',
  templateUrl: './entry-view.component.html',
  styleUrls: ['./entry-view.component.css']
})
export class EntryViewComponent implements OnInit {

  entries: Array<Entry>;

  constructor(private restService: RestService) {
    restService.getAllEntries('nimchimpsky').subscribe(response => {
      this.entries = response;
    });
  }

  ngOnInit() {
  }

}