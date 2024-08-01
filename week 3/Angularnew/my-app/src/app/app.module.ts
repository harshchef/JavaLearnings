import { CoursesService } from './courses/courses.service';
import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses/courses.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { SummaryPipe } from './courses/summary.pipe';
import { InputFormatDirective } from './courses/input-format.directive';
import { SignupFormComponent } from './signup-form/signup-form.component';
import { Route, RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { PostsComponent } from './posts/posts.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    SummaryPipe,
    SignupFormComponent,

    InputFormatDirective,
      HomeComponent,
      UsersComponent,
      PostsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
   
    AppRoutingModule
  ],
  providers: [
    provideClientHydration(),
    CoursesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
