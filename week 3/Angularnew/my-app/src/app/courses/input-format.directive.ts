import { Directive, HostListener, Input, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appInputFormat]'
})
export class InputFormatDirective {
  @Input('appInputFormat') format :any;

  constructor(private el: ElementRef, private renderer: Renderer2) { }

  @HostListener('focus') onFocus() {
    const value = this.el.nativeElement.value;
    if (this.format === 'uppercase') {
      this.el.nativeElement.value = value.toUpperCase();
    } else if (this.format === 'lowercase') {
      this.el.nativeElement.value = value.toLowerCase();
    }
    console.log("focus");
  }

  @HostListener('blur') onBlur() {
    const value = this.el.nativeElement.value;
    if (this.format === 'uppercase') {
      this.el.nativeElement.value = value.toUpperCase();
    } else if (this.format === 'lowercase') {
      this.el.nativeElement.value = value.toLowerCase();
    }
    console.log("Blur");
  }
}
