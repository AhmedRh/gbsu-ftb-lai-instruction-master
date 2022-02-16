import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  
  constructor(private httpClient: HttpClient) { 

  }

  getConvertedNumber(inputNumber: number) {
    return this.httpClient.get(`http://localhost:8080/gbsu-ftb-lai/${inputNumber}`);
  }



}
