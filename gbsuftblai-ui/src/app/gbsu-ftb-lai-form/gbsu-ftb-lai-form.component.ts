import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit {

  form : FormGroup;
  
  @Output() submitNumberOutput = new EventEmitter();


  constructor() {

  }

  ngOnInit(): void {
    this.form = new FormGroup({
      inputNumber: new FormControl(Validators.required)
    });
  }

  submitNumber(): void {
    this.submitNumberOutput.emit(this.form.value.inputNumber);
  }

}
