import { Attack } from './../../../Models/Attack';
import { BackendService } from './../../../Util/backend.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test-component-again',
  templateUrl: './test-component-again.component.html',
  styleUrls: ['./test-component-again.component.css']
})
export class TestComponentAgainComponent implements OnInit {

  constructor(private backendService: BackendService) { }

  ngOnInit() {
  }

  submit() {
    const attack: Attack = new Attack();
    let userName: string;
    let thoughts: string[];
    let date: Date;

    userName = (document.getElementById('userName') as HTMLInputElement).value;
    thoughts = (document.getElementById('thoughts') as HTMLInputElement).value.split(',');
    date = Date.parse((document.getElementById('date') as HTMLInputElement).value);
    attack.userName = userName;
    attack.thoughts = thoughts;
    this.backendService.postAttack(attack).subscribe(response => alert(response),
      err => alert(err)
    );
  }
}
