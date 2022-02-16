import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent implements OnInit, OnDestroy {

  subscription: Subscription;
  numberConvertedList: Array<NumberConverted>;

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  ngOnInit(): void {
    this.numberConvertedList = [];
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }

  convertNumber(inputNumber: number): void {
    this.subscription = this.gbsuFtbLaiService.getConvertedNumber(inputNumber)
        .subscribe(
          (numberConvertedResult: NumberConverted) => this.numberConvertedList.push(numberConvertedResult),
          (error => console.log(error))
        );
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
