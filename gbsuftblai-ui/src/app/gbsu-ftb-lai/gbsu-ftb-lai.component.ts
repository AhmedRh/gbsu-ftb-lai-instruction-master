import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  numberConvertedResult: NumberConverted;

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    this.gbsuFtbLaiService.getConvertedNumber(inputNumber)
        .subscribe(
          (numberConvertedResult: NumberConverted) => this.numberConvertedResult = numberConvertedResult,
          (error => console.log(error))
        );
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
