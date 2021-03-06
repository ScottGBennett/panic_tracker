import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Entry } from '../entry/entry/entry.model';
import { Observable } from 'rxjs/internal/Observable';
import { catchError } from 'rxjs/operators';
import { of } from 'rxjs/internal/observable/of';

const httpPostOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json'
  })
};

const postEntryUrl = 'http://localhost:8080/entry/submit';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http: HttpClient) { }

  postEntry(entry: Entry): Observable<Entry> {
    return this.http.post<Entry>(postEntryUrl, entry, httpPostOptions)
      .pipe(
        catchError(this.handleError('postEntry', entry))
      );
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }

}
