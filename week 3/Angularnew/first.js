"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Car_1 = require("./Car");
var adi = {
    name: "aditya",
    age: 30
};
var Student = /** @class */ (function () {
    function Student(nm, cr) {
        this.name = nm;
        this.course = cr;
    }
    Student.prototype.fullname = function (a) {
        return "hello ".concat(a, " ").concat(this.name);
    };
    return Student;
}());
var st = new Student("adi", "science");
console.log(st.name);
var AdvStudent = /** @class */ (function () {
    function AdvStudent(addr, name, age) {
        this.addr = addr;
        this.name = name;
        this.age = age;
    }
    AdvStudent.prototype.fullName = function () {
        return "".concat(this.addr, " ").concat(this.name);
    };
    AdvStudent.prototype.isAdult = function () {
        return this.age >= 18;
    };
    return AdvStudent;
}());
var student2 = new AdvStudent("Bob", "Johnson", 19);
var abc = "jacsknksajc";
var size = abc.length;
var tt = 123;
var greet = function (nm) { return "hello ".concat(nm); };
console.log("hello" + greet("adi"));
var message = "bhdsabck";
var Point = /** @class */ (function () {
    function Point(x, y, z) {
        this._x = x;
        this._y = y;
        this._z = z;
    }
    Object.defineProperty(Point.prototype, "x1", {
        // Getter for x
        get: function () {
            return this._x;
        },
        // Setter for x
        set: function (value) {
            this._x = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "y", {
        // Getter for y
        get: function () {
            return this._y;
        },
        // Setter for y
        set: function (value) {
            this._y = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "z", {
        // Getter for z (optional)
        get: function () {
            return this._z;
        },
        // Setter for z (optional)
        set: function (value) {
            this._z = value;
        },
        enumerable: false,
        configurable: true
    });
    return Point;
}());
var temp = new Car_1.Car("afskv", "acdsakcdsmcn");
console.log(Car_1.Car);
//using the imported function  and constants
var sum = (0, Car_1.add)(10, 30);
console.log(sum);
console.log("value of pi is ".concat(Car_1.pi, "."));
