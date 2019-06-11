import { RestService } from './service/rest.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EntryComponent } from './entry/entry/entry.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { EntryViewComponent } from './entry-view/entry-view.component';

@NgModule({
  declarations: [
    AppComponent,
    EntryComponent,
    EntryViewComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
