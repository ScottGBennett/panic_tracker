import { BackendService } from './../../Util/backend.service';
import { Attack } from '../../Models/Attack';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-entry',
  templateUrl: './entry.component.html',
  styleUrls: ['./entry.component.css']
})
export class EntryComponent implements OnInit {

  constructor(private backendService: BackendService) { }

  ngOnInit() {
  }

  submit() {
    const attack: Attack = new Attack();
    let userName: string;

    userName = document.getElementById('userName').textContent;
    attack.userName = userName;
    this.backendService.postAttack(attack);
  }

}
