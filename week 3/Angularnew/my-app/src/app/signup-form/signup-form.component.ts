// import { Component } from '@angular/core';
// import { FormControl, FormGroup, Validators } from '@angular/forms';
// import { UsernameValidators } from './username.validators';

// @Component({
//   selector: 'signup-form',
//   templateUrl: './signup-form.component.html',
//   styleUrls: ['./signup-form.component.css']
// })
// export class SignupFormComponent {
//   form=new FormGroup({
//     account: new FormGroup({
//     username:new FormControl('',[Validators.required,Validators.minLength(3),
//       UsernameValidators.cannotContainSpace,
      
//     ],UsernameValidators.shouldBeUnique,),
//     password:new FormControl(),
//   })
//   });
//   get username()
//   {
//     return this.form.get('account.username');
//   }

// }

import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsernameValidators } from './username.validators';

@Component({
  selector: 'signup-form',
  templateUrl: './signup-form.component.html',
  styleUrls: ['./signup-form.component.css']
})
export class SignupFormComponent {
  form: FormGroup;

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      account: this.fb.group({
        username: [
          '', 
          [
            Validators.required,
            Validators.minLength(3),
            UsernameValidators.cannotContainSpace
          ], 
          [UsernameValidators.shouldBeUnique]
        ],
        password: ''
      })
    });
  }

  get username() {
    return this.form.get('account.username');
  }
}
