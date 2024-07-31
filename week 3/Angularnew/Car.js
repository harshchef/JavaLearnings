"use strict";
// export class Car{
//     constructor(public name:string, public mode:string )
//     {
Object.defineProperty(exports, "__esModule", { value: true });
exports.pi = exports.Car = void 0;
exports.add = add;
//     }
// }
var Car = /** @class */ (function () {
    function Car(name, mode) {
        this.name = name;
        this.mode = mode;
    }
    // Optional: You can add methods to the Car class if needed
    Car.prototype.getDetails = function () {
        return "Car: ".concat(this.name, ", Mode: ").concat(this.mode);
    };
    return Car;
}());
exports.Car = Car;
var Person = /** @class */ (function () {
    function Person(name, age, address) {
        this.name = name;
        this.age = age;
        this.address = address;
        // The constructor automatically assigns the values to instance properties
    }
    return Person;
}());
var person = new Person('John Doe', 30, '123 Main St');
console.log(person.name); // Output: John Doe
console.log(person.age); // Output: 30
console.log(person.address); // Output: 123 Main St
function add(a, b) {
    return a + b;
}
//export a constant
exports.pi = 3.14;
