// export class Car{
//     constructor(public name:string, public mode:string )
//     {

//     }

    
// }
export class Car {
    constructor(public name: string, public mode: string) { }

    // Optional: You can add methods to the Car class if needed
    public getDetails(): string {
        return `Car: ${this.name}, Mode: ${this.mode}`;
    }
}

class Person {
    constructor(public name: string, public age: number, public address?: string) {
        // The constructor automatically assigns the values to instance properties
    }
}

const person = new Person('John Doe', 30, '123 Main St');
console.log(person.name); // Output: John Doe
console.log(person.age); // Output: 30
console.log(person.address); // Output: 123 Main St

export function add(a:number, b:number) : number{
    return a+b;
}
 
//export a constant
export const pi = 3.14;