import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Attack } from './../Models/Attack';

const acceptHeader = {
  headers: new HttpHeaders({ Accept: 'application/json' })
};

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class BackendService {
  constructor(private http: HttpClient) {}
  postAttack(attack: Attack) {
    const url = 'http://localhost:8080/submit';
    return this.http.post(url, attack, httpOptions)
    .pipe(
      catchError(this.handleError('postAttack', []))
    );
  }



  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }
}
