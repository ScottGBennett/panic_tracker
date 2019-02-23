import { Router } from '@angular/router';
import { HttpClient, HttpHandler, HttpClientModule } from '@angular/common/http';
import { BackendService } from './Util/backend.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EntryComponent } from './AttackEntry/entry/entry.component';
import { TestComponentAgainComponent } from './AttackEntry/anotherTest/test-component-again/test-component-again.component';

@NgModule({
  declarations: [
    AppComponent,
    EntryComponent,
    TestComponentAgainComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [BackendService, HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule { }
