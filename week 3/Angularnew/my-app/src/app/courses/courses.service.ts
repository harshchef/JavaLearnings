import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  constructor() { }
  getCourses()
  {
    return ['cr12','cr2','cr3']
  }
}
