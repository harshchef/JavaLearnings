import { CoursesService } from './courses/courses.service';
import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CoursesComponent } from './courses/courses.component';
import { FormsModule } from '@angular/forms';
import { SummaryPipe } from './courses/summary.pipe';
import { InputFormatDirective } from './courses/input-format.directive';

@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    SummaryPipe,
    InputFormatDirective
  ],
  imports: [
    BrowserModule,
    FormsModule,
   
    AppRoutingModule
  ],
  providers: [
    provideClientHydration(),
    CoursesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
