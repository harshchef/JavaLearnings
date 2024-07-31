
import { pi, add, Car } from "./Car";

interface Person{
   name:string;
   age: number;
    addr?: string;

}

let adi:Person={
    name:"aditya",
    age:30
}

class Student{
   public name:string;
    private course:string;
   constructor(nm: string,cr: string){
    this.name=nm;
    this.course=cr;

   
   }
   public fullname(a:string ) : string{
    return `hello ${a} ${this.name}`;

}
}

let st=new Student("adi","science");
console.log(st.name );



class AdvStudent{
    constructor(private addr:string, public name:string,public age:number)
    {

    }
    public fullName(): string {
        return `${this.addr} ${this.name}`;
      }
      public isAdult(): boolean {
        return this.age >= 18;
      }
}
let student2 = new AdvStudent("Bob", "Johnson", 19);

let abc:any="jacsknksajc";
let size=(abc as string).length;
let tt:number=123;

let greet=(nm:string ): string => `hello ${nm}`;
console.log("hello"+greet("adi"));




let message="bhdsabck";
class Point {
    private _x: number;
    private _y: number;
    private _z?: number; // Optional property

    constructor(x: number, y: number, z?: number) {
        this._x = x;
        this._y = y;
        this._z = z;
    }

    // Getter for x
    get x1(): number {
        return this._x;
    }

    // Setter for x
    set x1(value: number) {
        this._x = value;
    }

    // Getter for y
    get y(): number {
        return this._y;
    }

    // Setter for y
    set y(value: number) {
        this._y = value;
    }

    // Getter for z (optional)
    get z(): number | undefined {
        return this._z;
    }

    // Setter for z (optional)
    set z(value: number | undefined) {
        this._z = value;
    }
}

let temp=new Car("afskv","acdsakcdsmcn");

console.log(Car);


//using the imported function  and constants
const sum = add(10, 30);
console.log(sum);
console.log(`value of pi is ${pi}.`);