import { BackendService } from './../../Util/BackendService';
import { Attack } from './../../Models/Attack';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-component',
  templateUrl: './test-component.component.html',
  styleUrls: ['./test-component.component.css']
})
export class TestComponentComponent implements OnInit {

  constructor(private backendService: BackendService) { }

  ngOnInit() {
  }

  submit() {
    var attack: Attack = new Attack();
    var userName: string;

    userName = document.getElementById("userName").textContent;
    this.backendService.postAttack(attack);
  }

}
