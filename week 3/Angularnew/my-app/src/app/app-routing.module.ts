import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses/courses.component';
import { SignupFormComponent } from './signup-form/signup-form.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';

const appRoutes:Routes=[
  {
    path: '',component: HomeComponent
  },
  {
    path: 'users/:id/:name',component: UsersComponent
  },
    {
      path: 'course',component: CoursesComponent
    },
    {
      path: "signup",component: SignupFormComponent
    }
  ];
  
@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
