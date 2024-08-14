import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrl: './form.component.css'
})
export class FormComponent {
  formGroup=new FormGroup({
  name: new FormControl('',[Validators.required]),
  email:new FormControl('',[Validators.required,Validators.email]),
  age: new FormControl('',[Validators.required,Validators.min(18)])
})
}
