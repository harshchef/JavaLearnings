import { Component } from '@angular/core';
import { CoursesService } from './courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css'] // Corrected to "styleUrls"
})
export class CoursesComponent {
  title = "hello";
  courses: string[]; // Assuming getCourses() returns an array of strings
  email: string | undefined; // Define the type for better clarity

  constructor(private service: CoursesService) {
    this.courses = service.getCourses() || []; // Handle potential null/undefined
  }

  OnKeyUp() {
    console.log(this.email);
  }

  onSave($event: Event) { // Use the Event type for better typing
    console.log("Saved", $event);
  }
  text=`
  Lorem ipsum dolor sit amet consectetur adipisicing elit. Officiis aliquid debitis natus nisi impedit tenetur consequuntur placeat pariatur eaque earum alias minima sint aut, omnis eveniet rerum quaerat. Natus, molestias
  `
  imageUrl = "https://images.pexels.com/photos/674010/pexels-photo-674010.jpeg";
}
